/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.Landlord;
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
public class LandlordDAO implements DAO<Landlord>{
    
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<Landlord> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Landlord> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean addToUser(String username, String ID) {
        boolean b = false;

        try {
            String query = "insert into Landlord values(" + ID + ",'" + username + "');";
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
    public boolean add(Landlord landlord) throws SQLException {
        boolean b = false;
        
        try {
            String query = "insert into LandlordInfo (LandlordID, Landlord_Name, Landlord_Phone, Landlord_Email) "
                    + "values (?, ?, ?, ?);";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, landlord.getLandlordID());
            ps.setString(2, landlord.getLandlordName());
            ps.setString(3, landlord.getLandlordPhone());
            ps.setString(4, landlord.getLandlordMail());
            
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
    public boolean update(Landlord item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}