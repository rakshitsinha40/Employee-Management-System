package com.barclays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.Scanner;

@Controller
public class Presentation {
    @RequestMapping("/welcome")
    public static void MainMenu() throws SQLException {
        Service service = new Service();
        int input;
        do
         {

            System.out.println("Welcome to Employee management system ");
            System.out.println(" 1. Create ");
            System.out.println(" 2. Read ");
            System.out.println(" 3. Update ");
            System.out.println(" 4. Delete ");
            System.out.println(" Any other number to exit :  ");
            Scanner sc = new Scanner(System.in);

            input = sc.nextInt();
            service.selection(input);
        }while (input > 0 && input < 5);
    }


}
