package com.barclays;

import java.util.HashMap;

public class DataMap implements Data{
    static HashMap<String, Emp> employeeMap = new HashMap();

    public void add(String Id,Emp emp)
    {
        employeeMap.put(Id,emp);
    }

    public boolean check(String Id)
    {
        return employeeMap.containsKey(Id);
    }

    public Emp read(String Id)
    {
        return employeeMap.get(Id);
    }

    public void update(String Id,Emp emp)
    {
        employeeMap.replace(Id,emp);
    }

    public void delete(String Id)
    {
        employeeMap.remove(Id);
    }

}

//https://github.com/rakshitsinha40/Employee-Management-System.git