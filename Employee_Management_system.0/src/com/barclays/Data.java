package com.barclays;

import java.util.HashMap;

public class Data {
    static HashMap<String, Emp> employee = new HashMap<>();

    public static void add(String Id,Emp emp)
    {
        employee.put(Id,emp);
    }

    public static boolean check(String Id)
    {
        return employee.containsKey(Id);
    }

    public static Emp read(String Id)
    {
        return employee.get(Id);
    }

    public static void update(String Id,Emp emp)
    {
        employee.replace(Id,emp);
    }

    public static void delete(String Id)
    {
        employee.remove(Id);
    }

}
