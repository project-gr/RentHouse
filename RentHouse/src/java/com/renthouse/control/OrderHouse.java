/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.control;

import com.renthouse.bean.House;
import com.renthouse.bean.Landlord;
import com.renthouse.bean.Staff;
import com.renthouse.bean.Student;
import com.renthouse.bean.Users;
import com.renthouse.dao.HouseDAO;
import com.renthouse.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "OrderHouse", urlPatterns = {"/OrderHouse"})
public class OrderHouse extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            House house = (House) session.getAttribute("house");

            String fname = request.getParameter("fname");
            String msg = request.getParameter("message");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            final String to = "elevengroupp@gmail.com";//your email id
            final String password = "elevengroup11";// your password
            Properties props = new Properties();
            props.put("mail.smtp.auth", true);
            props.put("mail.smtp.starttls.enable", true);
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            Session session1 = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(to, password);
                }
            });
            try {
                Message message = new MimeMessage(session1);
                message.setFrom(new InternetAddress(email));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
                MimeBodyPart textPart = new MimeBodyPart();
                Multipart multipart = new MimeMultipart();
                String final_Text = "Dear: " + fname + "\nWe have received your tenancy request with the message below: \n"
                        + msg
                        + "\nThis is your tenancy confirmation email."
                        + "\nWe will contact the landlord and schedule a home viewing with you by phone number: " + phone
                        + "\nThanks with regards!";
                textPart.setText(final_Text);
                message.setSubject("Your Confirmation Email");
                multipart.addBodyPart(textPart);
                message.setContent(multipart);
                message.setSubject("Your Confirmation Email");
                //out.println("Sending");
                Transport.send(message);

                int status = (Integer) house.getHouseStatus();
                int houseno = (Integer) house.getHouseNo();
                out.print(status+" and " + houseno);
                HouseDAO houseDAO = new HouseDAO();
                if (houseno > 0) {
                    int room = houseno - 1;
                    houseDAO.updateRoom(room, house.getHouseID());
                    if(room == 0){
                        houseDAO.updateStatus(1, house.getHouseID());
                    }
                }
                response.sendRedirect("Confirm.jsp");

            } catch (Exception e) {
                out.println(e);
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(forgotPassServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(forgotPassServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
