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
public class HouseDAO implements DAO<House> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Landlord getLandlord(String HouseID) {
        Landlord landlord = new Landlord();
        try {
            String query = "select * from LandlordInfo as LI\n"
                    + "inner join (Landlord_House as LH \n"
                    + "	inner join House as H\n"
                    + "	on LH.HouseID = H.HouseID)\n"
                    + "on LI.LandlordID = LH.LandlordID\n"
                    + "where H.HouseID = '" + HouseID + "';";

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
            Logger.getLogger(HouseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return landlord;
    }

    public String getHouseID(House house) {
        String ID = null;
        try {
            String query = "select HouseID from House where HouseNo = ?, Address = ?"
                    + "Street = ?, District = ?, City = ?, Description = ?, "
                    + "CoverImage = ?, Price = ?, House_Status = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setInt(1, house.getHouseNo());
            ps.setString(2, house.getAddress());
            ps.setString(3, house.getStreet());
            ps.setString(4, house.getDistrict());
            ps.setString(5, house.getCity());
            ps.setString(6, house.getDescription());
            ps.setString(7, house.getCoverImage());
            ps.setFloat(8, house.getPrice());
            ps.setInt(9, house.getHouseStatus());

            rs = ps.executeQuery();

            while (rs.next()) {
                ID = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return ID;
    }

    @Override
    public boolean add(House house) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public List<House> getHouseByDistrict(String name) {
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

    public House addHouse(House house) {
        try {
            String query = "insert into House values('" + house.getHouseID() + "'," + house.getHouseNo() + ", '" + house.getAddress() + "', '" + house.getStreet() + "', '"
                    + house.getDistrict() + "', '" + house.getCity() + "' ,'" + house.getDescription() + "', '"
                    + house.getCoverImage() + "', " + house.getPrice() + ", 0);";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return house;
    }

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
        boolean b = false;

        try {
            String query = "delete from House where id = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, id);

            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean update(House house) {
        boolean b = false;

        try {
            String query = "update House set House_No = " + house.getHouseNo()
                    + ", Address = '" + house.getAddress() + "', Street = '" + house.getStreet()
                    + "', District = '" + house.getDistrict() + "', City = '" + house.getCity()
                    + "', Descriptions = '" + house.getDescription() + "', "
                    + "Price = " + house.getPrice() + ", House_Status = " + house.getHouseStatus() + " where HouseID = '" + house.getHouseID() + "';";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public boolean updateStatus(int status, String ID) {
        boolean b = false;

        try {
            String query = "update House set House_Status = " + status + " where HouseID = '" + ID + "';";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean updateRoom(int room, String ID) {
        boolean b = false;

        try {
            String query = "update House set House_No = " + room + " where HouseID = '" + ID + "';";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
