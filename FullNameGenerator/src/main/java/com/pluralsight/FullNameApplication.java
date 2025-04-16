package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
// ask for first name
        System.out.println("first name");
        String firstName = nameScanner.nextLine();

        // ask for middle name:
       System.out.println("middle name. Press Enter if no middle name. ");
       String middleName = nameScanner.nextLine();


       // ask for last name:
        System.out.println("last name");
        String lastName = nameScanner.nextLine();


        // ask for suffix:
        System.out.println("suffix. Press Enter if none.");


        // display full name
        String FullName = "Glen Williams";
        String FirstName = "Glen";
        String MiddleName = "";
        String LastName = "Williams";


        System.out.println("First name:" + FirstName);
        System.out.println("Middle name:" + "");
        System.out.println("Last name:" + "" + LastName);
        System.out.println("Full Name:" + FullName);

        System.out.println("-------------------------");








    }
}
