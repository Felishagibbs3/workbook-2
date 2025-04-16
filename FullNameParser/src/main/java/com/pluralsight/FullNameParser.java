package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner fmlScanner = new Scanner(System.in);
        //ask for full name

        System.out.println("Enter Full name");
        String fullName = fmlScanner.nextLine();
    // trim name of extra spaces
        String firstName = "Dana";
        String middleName = "L";
        String lastName = "Wyatt";

        fullName = fullName.trim();

        String[] nameParts = fullName.split("\\s+");

        //Parse & display name parts
        if (nameParts.length == 3) {
            String FirstName = nameParts[0];
            String MiddleName = nameParts [1];
            String LastName = nameParts [2];

            System.out.println("First Name is:" + firstName);
            System.out.println("Middle name is:" + middleName);
            System.out.println("Last name is:" + lastName);
        } else {
            System.out.println("Use first/middle/last name format");
        }






    }
}
