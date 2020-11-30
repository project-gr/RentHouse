/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renthouse.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ren
 */
public interface DAO<T> {
    List<T> getList() throws SQLException;
    
    List<T> getElement (String name) throws SQLException;
    
    boolean add (T item) throws SQLException;
    
    boolean delete (String id) throws SQLException;
    
    boolean update (T item) throws SQLException;
}
