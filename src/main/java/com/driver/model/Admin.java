package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String passsword;
    @OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
    List<ServiceProvider> serviceProviders= new ArrayList<>();

    public Admin() {

    }

    public Admin(int id, String username, String passsword, List<ServiceProvider> serviceProviders) {
        this.id = id;
        this.username = username;
        this.passsword = passsword;
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

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}
