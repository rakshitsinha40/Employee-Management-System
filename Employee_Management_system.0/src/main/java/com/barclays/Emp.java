package com.barclays;

public class Emp {
    String id;
    String name;
    String address;
    String role;

    Emp(String ID,String NAME,String ADD,String ROLE )
    {
        this.id=ID;
        this.name=NAME;
        this.address=ADD;
        this.role=ROLE;
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
