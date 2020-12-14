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
public class HouseDAO implements DAO<House> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public boolean add(House house) throws SQLException {
        boolean b = false;

        try {
            String query = "insert into House (House_No, Address, Street, "
                    + "District, City, Descriptions, CoverImage, Price)"
                    + "values ('" + house.getHouseNo() + "', '"
                    + house.getAddress() + "', '" + house.getStreet() +"', "
                    + "'" + house.getDistrict() + "', '" + house.getCity() + "', "
                    + "'" + house.getDescription() + "', '" + house.getCoverImage()
                    + "', '" + house.getPrice() + "');";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public List<House> getHouseByStreet(String name) {
        List<House> houseList = null;
        House house = null;

        try {
            houseList = new ArrayList<House>();

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
                house.setDescription(rs.getString(7));
                house.setCoverImage(rs.getString(8));
                house.setPrice(rs.getFloat(9));
                house.setHouseStatus(rs.getInt(10));

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

            String query = "select * from House where District = ?";
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
                house.setDescription(rs.getString(7));
                house.setCoverImage(rs.getString(8));
                house.setPrice(rs.getFloat(9));
                house.setHouseStatus(rs.getInt(10));

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

            String query = "select * from House where City = ?";
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
                house.setDescription(rs.getString(7));
                house.setCoverImage(rs.getString(8));
                house.setPrice(rs.getFloat(9));
                house.setHouseStatus(rs.getInt(10));

                houseList.add(house);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseList;
    }
<<<<<<< HEAD
    
    public House add(House house) {
        try {
            String query = "insert into House values(0," + house.getHouseNo() + ", '" + house.getAddress() + "', '" + house.getStreet() + "', '" 
                    + house.getDistrict() + "', '" + house.getCity() + "' ,'" + house.getDescription() + "', '" + house.getCoverImage() + "', " + house.getPrice() + ", 0);";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return house;
    }

    @Override
    public List<Landlord> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
=======
>>>>>>> 48ea539ff2cfe2e2efeecd4bc4e5b22fec4ed507

    @Override
    public List<House> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<House> getElement(String name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(House item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}