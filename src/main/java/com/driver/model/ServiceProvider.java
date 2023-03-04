package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "serviceprovider")

public class ServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "serviceProviderList", cascade = CascadeType.ALL)
    private List<User> users;
    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private List<Country> countryList;
    private List<Connection> connections;

    @ManyToOne
    @JoinColumn
    private Admin admin;

    public ServiceProvider() {
    }

    public ServiceProvider(int id, String name, List<User> users, List<Country> countryList, List<Connection> connections, Admin admin) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.countryList = countryList;
        this.connections = connections;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
