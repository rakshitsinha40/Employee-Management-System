package com.barclays;

import java.util.Scanner;

public class Service extends Data{
    public static void Selection(int input) {
        //Data hm=new Data();
        Scanner sc=new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.println("Please Enter the details of employee ");
                Emp emp;
                emp=CreateEmp();
                employee.put(emp.getId(),emp);
                break;
            case 2:
                System.out.println("Please enter Id to read : ");
                String read_ID = sc.next();

                if (employee.containsKey(read_ID)) {
                    emp=employee.get(read_ID);
                    Show(emp);

                }else
                {
                    System.out.println("ID not found\n");
                }
                break;
            case 3:
                System.out.println(" Enter Id to be updated: ");
                String update_ID = sc.next();
                if (employee.containsKey(update_ID)) {

                    emp=UpdateEmp(update_ID);
                    employee.replace(update_ID, emp);

                }else
                {
                    System.out.println("ID not found\n");
                }
                break;
            case 4:
                System.out.println("Please enter Id to be deleted: ");
                String delete_ID = sc.next();
                if (employee.containsKey(delete_ID)) {
                    employee.remove(delete_ID);
                    System.out.println("Employee record Deleted Successfully\n");
                }
                else
                {
                    System.out.println("ID not found\n");
                }
                break;
            default:
                System.out.println("!! Thank you for using Employee Management System !!");
                break;

        }
    }

    public static Emp CreateEmp()
    {
        Emp emp = new Emp();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Id : ");
        emp.setId(sc.next());
        System.out.println(" Enter Name : ");
        emp.setName(sc.next());
        System.out.println(" Enter Address : ");
        emp.setAddress(sc.next());
        System.out.println(" Enter  Role : ");
        emp.setRole(sc.next());
        return emp;
    }

    public static void Show(Emp emp)
    {
        System.out.println("Found ID : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Address : "+emp.getAddress());
        System.out.println("Role : "+emp.getRole());
    }

    public static Emp UpdateEmp(String Update_ID)
    {
        Emp emp = new Emp();
        Scanner sc=new Scanner(System.in);
        //System.out.println(" Enter Id : ");
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
