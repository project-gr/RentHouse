/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.UserBean;
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
public class UserDAO implements DAO<UserBean>{
    Connection conn = null; 
    PreparedStatement ps = null; 
    ResultSet rs = null;
    
    public UserBean checkLogin (String username, String password) {
        try {
            String query = "select * from Users where Username = ? and Password = ?";
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                UserBean user = new UserBean(rs.getString(1), rs.getString(2), rs.getString(3));
                return user;
            }
            
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<UserBean> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserBean> getElement(String username) throws SQLException {
        List<UserBean> userList = null;
        UserBean userBean = null;
        
        try {
            userList = new ArrayList<UserBean>();
            String query = "select * from Users where Username like '" + username + "'";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                userBean = new UserBean();
                userBean.setUsername(rs.getString(1));
                userBean.setPassword(rs.getString(2));
                userBean.setUsertype(rs.getString(3));
                
                userList.add(userBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean add(UserBean user) throws SQLException {
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
    public boolean update(UserBean item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
