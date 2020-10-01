package com.barclays;

public class Read {

    public static void Show(Emp emp)
    {
        System.out.println("Found ID : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Address : "+emp.getAddress());
        System.out.println("Role : "+emp.getRole());
    }
}
