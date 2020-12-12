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

/**
 *
 * @author Ren
 */
public class HouseDAO implements DAO<Landlord> {

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

    @Override
    public boolean add(Landlord item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Landlord item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<House> getHouseByStreet(String name) {
        List<House> houseList = null;
        House house = null;

        try {
            houseList = new ArrayList<House>();
            house = new House();

            String query = "select * from House where Street = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, name);

            rs = ps.executeQuery();

            while (rs.next()) {
                house = new House();
                house.setHouseID(rs.getString(1));
                house.setHouseNo(rs.getInt(2));
                house.setAddress(rs.getString(3));
                house.setStreet(rs.getString(4));
                house.setDistrict(rs.getString(5));
                house.setCity(rs.getString(6));
                house.setHouseStatus(rs.getBoolean(7));

                houseList.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseList;
    }
    
    public List<House> getHouseByDistrict (String name) {
        List<House> houseList = null;
        House house = null;

        try {
            houseList = new ArrayList<House>();
            house = new House();

            String query = "select * from House "
                    + "where House.District = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, name);

            rs = ps.executeQuery();

            while (rs.next()) {
                house = new House();
                house.setHouseID(rs.getString(1));
                house.setHouseNo(rs.getInt(2));
                house.setAddress(rs.getString(3));
                house.setStreet(rs.getString(4));
                house.setDistrict(rs.getString(5));
                house.setCity(rs.getString(6));
                house.setHouseStatus(rs.getBoolean(7));

                houseList.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseList;
    }
    
    public List<House> getHouseByCity(String name) {
        List<House> houseList = null;
        House house = null;

        try {
            houseList = new ArrayList<House>();
            house = new House();

            String query = "select * from House "
                    + "where House.City = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, name);

            rs = ps.executeQuery();

            while (rs.next()) {
                house = new House();
                house.setHouseID(rs.getString(1));
                house.setHouseNo(rs.getInt(2));
                house.setAddress(rs.getString(3));
                house.setStreet(rs.getString(4));
                house.setDistrict(rs.getString(5));
                house.setCity(rs.getString(6));
                house.setHouseStatus(rs.getBoolean(7));

                houseList.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
