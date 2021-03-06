/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import com.renthouse.bean.Landlord;
import com.renthouse.bean.Staff;
import com.renthouse.bean.Student;
import com.renthouse.bean.Users;
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
public class UserDAO implements DAO<Users> {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Users checkLogin(String username, String password) {
        try {
            String query = "select * from Users where Username = ? and Password = ?";
            conn = DBcontext.getConnection();
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

    public Student getStudent(String username) {
        try {
            String query = "select * from StudentInfo\n"
                    + "inner join dbo.Student as S\n"
                    + "on StudentInfo.StudentID = S.StudentID\n"
                    + "where S.Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                return student;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Landlord getLandlord(String username) {
        try {
            String query = "select * from LandlordInfo\n"
                    + "inner join dbo.Landlord as S\n"
                    + "on LandlordInfo.LandlordID = S.LandlordID\n"
                    + "where S.Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                Landlord landlord = new Landlord(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return landlord;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Staff getStaff(String username) {
        try {
            String query = "select * from StaffInfo\n"
                    + "inner join dbo.Staff as S\n"
                    + "on StaffInfo.StaffID = S.StaffID\n"
                    + "where S.Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                Staff staff = new Staff(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return staff;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getStudentID(String username) {
        try {
            String query = "select StudentID from Student where Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                return ID;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getLandlordID(String username) {
        try {
            String query = "select LandlordID from Landlord where Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                return ID;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getStaffID(String username) {
        try {
            String query = "select StaffID from Staff where Username = ?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, username);

            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                return ID;
            }

        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean add(Users user) throws SQLException {
        boolean b = false;

        try {
            String query = "insert into Users values (?, ?, ?);";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getUsertype());
            rs = ps.executeQuery();

            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
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

            while (rs.next()) {
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

    public Users selectUser(String username) throws Exception {
        Users user = new Users();
        try {
            String query = "select * from Users where username =?";

            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setUsertype(rs.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
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
