/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.control;

import com.renthouse.bean.Landlord;
import com.renthouse.bean.Staff;
import com.renthouse.bean.Student;
import com.renthouse.bean.Users;
import com.renthouse.context.DBcontext;
import com.renthouse.dao.LandlordDAO;
import com.renthouse.dao.StaffDAO;
import com.renthouse.dao.StudentDAO;
import com.renthouse.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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

    public InfoControl() throws Exception {
        this.connection = DBcontext.getConnection();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=House;user=sa;password=sa";
    Connection connection;
    Statement statement = null; //step 4
    PreparedStatement ps = null;
    ResultSet rs = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String fname = request.getParameter("fname");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");

            String username = request.getParameter("username");
            String type = request.getParameter("type");
            String ID = request.getParameter("ID");
            UserDAO userDAO = new UserDAO();
            if (type.equals("Landlord")) {
                String LandlordID = userDAO.getLandlordID(username);
                
                LandlordDAO landlordDAO = new LandlordDAO();
                Landlord landlord = new Landlord(ID,fname,phone,email);
                landlordDAO.add(landlord);
                landlordDAO.addToUser(ID, username);
                statement = connection.createStatement();

                String query = "update LandlordInfo set Landlord_Name = '" + fname + "', Landlord_Phone= '"
                        + phone + "', Landlord_Email = '" + email + "'where LandlordID='" + LandlordID + "';";
                statement.execute(query);

                request.getRequestDispatcher("Profile.jsp").forward(request, response);
            } else if (type.equals("Student")) {
                String StudentID = userDAO.getStudentID(username);
                StudentDAO studentDAO = new StudentDAO();
                Student student = new Student(ID,fname,phone,email, 0);
                studentDAO.add(student);
                studentDAO.addToUser(ID, username);

                statement = connection.createStatement();

                String query = "update StudentInfo set Student_Name = '"
                        + fname + "', Student_Phone = '" + phone + "', Student_Email = '"
                        + email + "' where  StudentID = '" + StudentID + "';";
                statement.execute(query);

                request.getRequestDispatcher("ProfileStudent.jsp").forward(request, response);
            } else if (type.equals("Staff")) {
                String StaffID = userDAO.getStaffID(username);
                StaffDAO staffDAO = new StaffDAO();
                Staff staff = new Staff(ID,fname,phone,email);
                staffDAO.add(staff);
                staffDAO.addToUser(ID, username);

                statement = connection.createStatement();

                String query = "update StaffInfo set Staff_Name = '"
                        + fname + "', Staff_Phone = '" + phone + "', Staff_Email = '"
                        + email + "' where  StaffID = '" + StaffID + "';";
                statement.execute(query);

                request.getRequestDispatcher("Profile.jsp").forward(request, response);
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
