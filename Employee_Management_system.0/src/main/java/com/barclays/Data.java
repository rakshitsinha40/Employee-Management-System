package com.barclays;


import java.sql.SQLException;

public interface Data {

    void add(String Id,Emp emp);


    boolean check(String Id) throws SQLException;


    Emp read(String Id) throws SQLException;


    void update(String Id,Emp emp) throws SQLException;


    void delete(String Id) throws SQLException;


}
