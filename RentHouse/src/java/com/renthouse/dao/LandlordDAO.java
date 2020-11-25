/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.LandlordInfo;
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
public class LandlordDAO implements DAO<LandlordInfo>{
    
    Connection conn = null; 
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public List<LandlordInfo> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LandlordInfo> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(LandlordInfo landlord) throws SQLException {
        boolean b = false;
        
        try {
            String query = "insert into LandlordInfo (LandlordID, Landlord_Name, Landlord_Phone, Landlord_Email"
                    + "(" + landlord.getLandlordID() + ", " + landlord.getLandlordName() + ", " + landlord.getLandlordPhone()
                    + ", " + landlord.getLandlordMail() + ")";
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
    public boolean update(LandlordInfo item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
