package com.barclays;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        HashMap<String, Emp> employee = new HashMap<>();
        int input=1;

        while (input > 0 && input < 5) {
        MainMenu.Display();
        Scanner sc = new Scanner(System.in);
            Emp emp;
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Please Enter the details of employee ");
                    emp=Create.CreateEmp();
                    employee.put(emp.getId(),emp);
                    break;
                case 2:
                    System.out.println("Please enter Id to read : ");
                    String read_ID = sc.next();
                    if (employee.containsKey(read_ID)) {
                        emp=employee.get(read_ID);
                        Read.Show(emp);

                    }else
                    {
                        System.out.println("ID not found\n");
                    }
                    break;
                case 3:
                    System.out.println(" Enter Id to be updated: ");
                    String update_ID = sc.next();
                    if (employee.containsKey(update_ID)) {

                        emp=Update.UpdateEmp(update_ID);
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
    }
}
