/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.Student;
import com.renthouse.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ren
 */
public class StudentDAO implements DAO<Student> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean addToUser(String username, String ID) {
        boolean b = false;

        try {
            String query = "insert into Student values('" + ID + "','" + username + "');";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public List<Student> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Student student) throws SQLException {
        boolean b = false;

        try {
            String query = "insert into StudentInfo (StudentID, Student_Name, Student_Phone, Student_Email, Student_Status) "
                    + "values (?, ?, ?, ?, '0');";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, student.getStudentID());
            ps.setString(2, student.getStudentName());
            ps.setString(3, student.getStudentPhone());
            ps.setString(4, student.getStudentMail());

            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Student item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
