package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {

       //create scanner to capture first + last name
        Scanner nameInput = new Scanner(System.in);
        System.out.println("what is your first name?");
        String firstName = nameInput.nextLine();
        System.out.println("what is your last name?");
        String lastName = nameInput.nextLine();
      //capture billing address + city + state + zip
        System.out.println("what is your billing address?");
        String address = nameInput.nextLine();
        System.out.println("what is your billing city?");
        String city = nameInput.nextLine();
        System.out.println("what is your billing state?");
        String state = nameInput.nextLine();
        System.out.println("what is your billing zip code?");
        String zip = nameInput.nextLine();
    // create a string builder and append user input data

        StringBuilder addInfo = new StringBuilder();
        addInfo.append( firstName);
        addInfo.append( lastName);
        addInfo.append( address);
        addInfo.append( city);
        addInfo.append( state);
        addInfo.append( zip);
    // string and concat the string builder together to display billing address

        String billCode = address.toString();
        String nameInfo = firstName + lastName.toString();

        System.out.println(firstName + " " + lastName);
        System.out.println(billCode + " " );
        System.out.println(city + " " + state);
        System.out.println(zip);

        System.out.println("----------------");
    // scanner for shipping info

        Scanner shipInfo = new Scanner(System.in);
        System.out.println("Shipping Street.");
        String shipStreet = shipInfo.nextLine();

        System.out.println("Shipping City.");
        String shipCity = shipInfo.nextLine();

        System.out.println("Shipping State.");
        String shipState = shipInfo.nextLine();

        System.out.println("Shipping Zipcode.");
        String shipZip = shipInfo.nextLine();
    // string shipping data together, using \n to create a new line

        String fullShippingAddress = shipStreet + "\n" + shipCity + "," + "\n" + shipState + "\n" + shipZip;

        System.out.println("\nGrover Smith:");
        System.out.println(fullShippingAddress);


    }
}
