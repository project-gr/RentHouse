/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.Staff;
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
public class StaffDAO implements DAO<Staff> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean addToUser(String username, String ID) {
        boolean b = false;

        try {
            String query = "insert into Staff values('" + ID + "','" + username + "');";
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
    public boolean add(Staff staff) throws SQLException {
        boolean b = false;

        try {
            String query = "insert into StaffInfo (StaffID, Staff_Name, Staff_Phone, Staff_Email) "
                    + "values (?, ?, ?, ?);";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, staff.getStaffID());
            ps.setString(2, staff.getStaffName());
            ps.setString(3, staff.getStaffPhone());
            ps.setString(4, staff.getStaffMail());

            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public List<Staff> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Staff> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Staff item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
