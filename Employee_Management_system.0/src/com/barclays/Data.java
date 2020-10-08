package com.barclays;



public interface Data {

    void add(String Id,Emp emp);


    boolean check(String Id);


    Emp read(String Id);


    void update(String Id,Emp emp);


    void delete(String Id);


}
