/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herokuapp.db.core;

import com.herokuapp.constant.DbConstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class JdbcTemplate<T> {
    
    public List<T> query(String sql,RowMapper<T> mapper)throws ClassNotFoundException,SQLException{
        List<T> rows=new ArrayList<>();
        Class.forName(DbConstant.DB_DRIVER);
        Connection conn = DriverManager
                .getConnection(DbConstant.DB_URL,
                        DbConstant.DB_USER, DbConstant.DB_Password);
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            rows.add(mapper.mapRow(rs));
        }
        conn.close();
        return rows;
    }
    
    public T queryForObject(String sql,Object[] params,RowMapper<T> mapper)throws ClassNotFoundException,SQLException{
        T row=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost/cmj18005_project",
                        "root", "admin");
        PreparedStatement stmt = conn.prepareStatement(sql);
        setParameters(stmt, params);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            row=mapper.mapRow(rs);
        }
        conn.close();
        return row;
    }
    private void setParameters(PreparedStatement stmt, Object[] params)
        throws SQLException{
        int counter=1;
        for(Object param:params){
            stmt.setObject(counter, param);
            counter++;
        }
    }
    public int update(String sql,Object... params)throws ClassNotFoundException,
            SQLException{
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql://localhost/cmj18005_project",
                        "root", "admin");
        
        PreparedStatement stmt = conn.prepareStatement(sql);
        setParameters(stmt, params);
        int result = stmt.executeUpdate();
        conn.close();
        return result; 
    }
    
}
