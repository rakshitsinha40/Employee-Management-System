package com.barclays;

import java.util.Scanner;

public class Update {

    public static Emp UpdateEmp(String Update_ID)
    {
        Emp emp = new Emp();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Id : ");
        emp.setId(Update_ID);
        System.out.println(" Enter Name : ");
        emp.setName(sc.next());
        System.out.println(" Enter Address : ");
        emp.setAddress(sc.next());
        System.out.println(" Enter  Role : ");
        emp.setRole(sc.next());
        return emp;
    }
}
