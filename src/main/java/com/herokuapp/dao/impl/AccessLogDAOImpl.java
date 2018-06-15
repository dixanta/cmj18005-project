/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herokuapp.dao.impl;

import com.herokuapp.dao.AccessLogDAO;
import com.herokuapp.db.core.JdbcTemplate;
import com.herokuapp.entity.AccessLog;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author USER
 */
public class AccessLogDAOImpl implements AccessLogDAO{
    private JdbcTemplate<AccessLog> template=
            new JdbcTemplate<>();
    @Override
    public List<AccessLog> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AccessLog getById(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(AccessLog model) throws ClassNotFoundException, SQLException {
        String sql="insert into accesslogs(url,ipaddress,"
                + "method,user_agent,data)"
                + " values(?,?,?,?,?)";
        return template.update(sql,new Object[]{
            model.getUrl(),model.getIpAddress(),
            model.getMethod(),model.getUserAgent(),
            model.getData()
        });
    }

    @Override
    public int update(AccessLog model) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
