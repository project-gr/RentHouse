/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.House;
import com.renthouse.bean.Landlord;
import com.renthouse.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ren
 */
public class LandlordDAO implements DAO<Landlord> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public Landlord selectLandlord(String LandlordID){
        Landlord landlord = new Landlord();
        try {
            String query = "select * from LandlordInfo where LandlordID = '" + LandlordID + "';";
            
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                landlord.setLandlordID(rs.getString(1));
                landlord.setLandlordName(rs.getString(2));
                landlord.setLandlordPhone(rs.getString(3));
                landlord.setLandlordMail(rs.getString(4));

            }
        } catch (Exception ex) {
            Logger.getLogger(LandlordDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return landlord;
    }
    
    
    public boolean addToHouse (String LandlordID, String HouseID){
        boolean b = false;
        try {
            String query = "insert into Landlord_House values ('" + LandlordID + "', '" + HouseID + "')";
            
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            rs = ps.executeQuery();
            return true;
        } catch (Exception e) {
        }
        return b;
    }

    public List<House> getListHouse(String LandlordID) {
        List<House> listHouse = null;
        House house = null;

        try {
            listHouse = new ArrayList<House>();
            String query = "select * from House\n"
                    + "inner join Landlord_House as L\n"
                    + "on House.HouseID = L.HouseID\n"
                    + "where L.LandlordID = ?;";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, LandlordID);
            
            rs = ps.executeQuery();

            while (rs.next()) {
                house = new House(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getFloat(9), rs.getInt(10));
                
                listHouse.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHouse;
    }

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
            String query = "insert into Landlord values('" + ID + "','" + username + "');";
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
