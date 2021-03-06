/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.control;

import com.renthouse.bean.Student;
import com.renthouse.bean.Users;
import com.renthouse.dao.StudentDAO;
import com.renthouse.dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ren
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

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
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            UserDAO userDAO = new UserDAO();
            Users user = userDAO.checkLogin(username, password);

            if (user == null) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User or password incorrect');");
                out.println("location='SignIn.jsp';");
                out.println("</script>");
//                request.getRequestDispatcher("SignIn.jsp").include(request, response);
            } else if (user.getUsertype().equals("Student")) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("CheckProfile.jsp");
//                request.getRequestDispatcher("ProfileStudent.jsp").forward(request, response);

            } else if (user.getUsertype().equals("Landlord")) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("CheckProfile.jsp");
//                request.getRequestDispatcher("Home.jsp").forward(request, response);

            } else if (user.getUsertype().equals("Staff")) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("CheckProfile.jsp");
//                request.getRequestDispatcher("Home.jsp").forward(request, response);
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
