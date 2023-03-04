package com.driver.model;

import jdk.internal.module.ServicesCatalog;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "admin_db")

public class Admin {
    private int id;
    private String username;
    private String password;
    private List<ServiceProvider> serviceProviders;

    public Admin(int id, String username, String password, List<ServiceProvider> serviceProviders) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.serviceProviders = serviceProviders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}
