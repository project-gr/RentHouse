/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.Users;
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
public class UserDAO implements DAO<Users>{
    
    Connection conn = null; 
    PreparedStatement ps = null; 
    ResultSet rs = null;
    
    public Users checkLogin (String username, String password) {
        try {
            String query = "select * from Users where Username = ? and Password = ?";
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Users user = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
                return user;
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<Users> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getElement(String username) throws SQLException {
        List<Users> userList = null;
        Users user = null;
        
        try {
            userList = new ArrayList<Users>();
            String query = "select * from Users where Username like '" + username + "'";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                user = new Users();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setUsertype(rs.getString(3));
                
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean add(Users user) throws SQLException {
        boolean b = false;
        
        try {
            String query = "insert into Users (Username, Password, Usertype"
                    + "(" + user.getUsername() + ", " + user.getPassword() + ", " + user.getUsertype() + ")";
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
    public boolean update(Users item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
