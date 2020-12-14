/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.control;

import com.renthouse.bean.House;
import com.renthouse.dao.HouseDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "UploadHouse", urlPatterns = {"/UploadHouse"})
public class UploadHouse extends HttpServlet {

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
            int houseno = Integer.parseInt(request.getParameter("HouseNo"));
            float price = Float.parseFloat(request.getParameter("Price"));
            String address = request.getParameter("Address");
            String street = request.getParameter("Street");
            String district = request.getParameter("District");
            String city = request.getParameter("City");
            String description = request.getParameter("Description");

//          Lay File Hinh Ne
            Part part = request.getPart("coverImage");
            String fileName = extractFileName(part);
            String savePath = File.separator + fileName;
            File fileSaveDir = new File(savePath);
            part.write(savePath + File.separator);
            
            House house = new House(houseno, address, street, district, city, description, savePath, price);
            HouseDAO houseDAO = new HouseDAO();
            houseDAO.add(house);
//            String ID = "0";
//            int House_Status = 0;
//            HouseDAO houseDAO = new HouseDAO();
//            House house, house1;
//            house = new House();
//            
//            house1 = new House(ID, houseno, address, street, district, city, description, savePath, price, House_Status);
//            
//            house = houseDAO.add(house1);
            response.sendRedirect("Home.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(UploadHouse.class.getName()).log(Level.SEVERE, null, ex);
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

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }


}
