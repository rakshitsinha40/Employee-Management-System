package com.barclays;

public class Emp {
    String id;
    String name;
    String address;
    String role;

    Emp()
    {
        this.id=null;
        this.name=null;
        this.address=null;
        this.role=null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRole() {
        return role;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
