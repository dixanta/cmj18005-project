/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.herokuapp.entity;

import java.util.Date;

/**
 *
 * @author USER
 */
public class AccessLog {
    private int id;
    private String url,method,ipAddress,userAgent,data;
    private Date accessDate;

    public AccessLog() {
    }

    public AccessLog(int id, String url, String method, String ipAddress, String userAgent, String data) {
        this.id = id;
        this.url = url;
        this.method = method;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Date accessDate) {
        this.accessDate = accessDate;
    }

    @Override
    public String toString() {
        return "AccessLog{" + "id=" + id + ", url=" + url + ", method=" + method + ", ipAddress=" + ipAddress + ", userAgent=" + userAgent + ", data=" + data + ", accessDate=" + accessDate + '}';
    }
    
    
    
}
