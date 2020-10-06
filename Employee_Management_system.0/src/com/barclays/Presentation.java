package com.barclays;

import java.util.Scanner;


public class Presentation extends Service{
    public static void MainMenu() {
        int input=1;

        while (input > 0 && input < 5) {

            System.out.println("Welcome to Employee management system ");
            System.out.println(" 1. Create ");
            System.out.println(" 2. Read ");
            System.out.println(" 3. Update ");
            System.out.println(" 4. Delete ");
            System.out.println(" Any other number to exit :  ");
            Scanner sc = new Scanner(System.in);

            input = sc.nextInt();
            Selection(input);
        }
    }


}
