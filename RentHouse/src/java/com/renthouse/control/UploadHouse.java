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
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
public class UploadHouse extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    String address, street, district, city, description;
    int houseno;
    float price;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//      Folder save image
        try (PrintWriter out = response.getWriter()) {
            //      Folder save image
            Part part = request.getPart("coverImage");
            String fileName = extractFileName(part);
            String savePath = File.separator + fileName;
            File fileSaveDir = new File(savePath);
            part.write(savePath + File.separator);
            
            address = request.getParameter("Address");
            street = request.getParameter("Street");
            district = request.getParameter("District");
            city = request.getParameter("City");
            description = request.getParameter("Description");
            price = Float.parseFloat(request.getParameter("Price"));
            houseno = Integer.parseInt(request.getParameter("houseno"));
            
            HouseDAO houseDAO = new HouseDAO();
            House house, house1;
            house = new House();
            house1 = new House(houseno, address, street, district, city, description, savePath, 0);
            house = houseDAO.addHouse(house1);
            response.sendRedirect("Home.jsp");
        }

    }

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
