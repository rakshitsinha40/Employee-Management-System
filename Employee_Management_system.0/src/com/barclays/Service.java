package com.barclays;

import java.util.Scanner;

public class Service {
    public static void Selection(int input) {
        Data emp_map=new Data();
        Scanner sc=new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.println("Please Enter the details of employee ");
                Emp emp;
                emp=CreateEmp();
                emp_map.add(emp.getId(),emp);
                break;
            case 2:
                System.out.println("Please enter Id to read : ");
                String read_ID = sc.next();

                if (emp_map.check(read_ID)) {
                    emp=emp_map.read(read_ID);
                    Show(emp);

                }else
                {
                    System.out.println("ID not found\n");
                }
                break;
            case 3:
                System.out.println(" Enter Id to be updated: ");
                String update_ID = sc.next();
                if (emp_map.check(update_ID)) {

                    emp=UpdateEmp(emp_map.read(update_ID));
                    emp_map.update(update_ID, emp);

                }else
                {
                    System.out.println("ID not found\n");
                }
                break;
            case 4:
                System.out.println("Please enter Id to be deleted: ");
                String delete_ID = sc.next();
                if (emp_map.check(delete_ID)) {
                    emp_map.delete(delete_ID);
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

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Id : ");
        String id=sc.next();
        System.out.println(" Enter Name : ");
        String name=sc.next();
        System.out.println(" Enter Address : ");
        String add=sc.next();
        System.out.println(" Enter  Role : ");
        String role=sc.next();
        Emp emp = new Emp(id,name,add,role);
        return emp;
    }

    public static void Show(Emp emp)
    {
        System.out.println("Found ID : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Address : "+emp.getAddress());
        System.out.println("Role : "+emp.getRole());
    }

    public static Emp UpdateEmp(Emp emp)
    {

        Scanner sc=new Scanner(System.in);

        System.out.println(" Enter Name : ");
        emp.setName(sc.next());
        System.out.println(" Enter Address : ");
        emp.setAddress(sc.next());
        System.out.println(" Enter  Role : ");
        emp.setRole(sc.next());
        return emp;
    }

}
