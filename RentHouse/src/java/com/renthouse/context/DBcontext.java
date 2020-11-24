/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author Ren
 */
public class DBcontext {
    private static final String serverName = "localhost";
    private static final String dbName = "House";
    private static final String portNumber = "1433";
    private static final String userID = "sa";
    private static final String password = "sa";
    private static Connection connection = null;
    
    static ArrayList<Connection> connList = new ArrayList<>();
    
    public static Connection getConnection() throws Exception {
        if (connection != null) {
            return connection;
        } else {
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, userID, password);
            return connection;
        }
    }
    
    public static void returnConnection(Connection connection) throws Exception {
        connList.add(connection);
    }
}
