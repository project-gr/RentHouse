/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.control;

import com.renthouse.bean.Landlord;
import com.renthouse.bean.Student;
import com.renthouse.bean.Users;
import com.renthouse.dao.LandlordDAO;
import com.renthouse.dao.StudentDAO;
import com.renthouse.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ren
 */
@WebServlet(name = "InfoControl", urlPatterns = {"/InfoControl"})
public class InfoControl extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String fname = request.getParameter("fname");
            String ID = request.getParameter("ID");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            String username = request.getParameter("username");
            
            UserDAO userDAO = new UserDAO();
            Users user = userDAO.selectUser(username);
            
            out.print(user.getUsertype());
            
            if (user.getUsertype().equals("Landlord")) {
                LandlordDAO landlordDAO = new LandlordDAO();
                Landlord landlord = new Landlord(ID, fname, phone, email);
                landlordDAO.add(landlord);
                
                landlordDAO.addToUser(username, ID);
            } else if (user.getUsertype().equals("Student")) {
                StudentDAO studentDAO = new StudentDAO();
                Student student = new Student(ID, fname, phone, email, 0);
                studentDAO.add(student);
                
                studentDAO.addToUser(username, ID);
            }

        } catch (Exception ex) {
            Logger.getLogger(InfoControl.class.getName()).log(Level.SEVERE, null, ex);
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
        processRequest(request, response);

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
        processRequest(request, response);
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
