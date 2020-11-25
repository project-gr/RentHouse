/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.StudentInfo;
import com.renthouse.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ren
 */
public class StudentDAO implements DAO<StudentInfo>{
    
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<StudentInfo> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentInfo> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(StudentInfo student) throws SQLException {
        boolean b = false;
        
        try {
            String query = "insert into StudentInfo (StudentID, Student_Name, Student_Phone, Student_Email, Student_Status"
                    + "(" + student.getStudentID()+ ", " + student.getStudentName()+ ", " + student.getStudentPhone()
                    + ", " + student.getStudentMail() + ", " + student.getStudentStatus()+ ")";
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
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(StudentInfo item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
