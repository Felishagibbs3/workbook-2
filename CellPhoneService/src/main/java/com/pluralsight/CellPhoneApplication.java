package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        //User input for phone data
        System.out.println("Enter Serial Number");
        String sN = myScanner.nextLine();

        System.out.println("Carrier");
        String car = myScanner.nextLine();

        System.out.println("Enter phone number");
        String pn = myScanner.nextLine();

        System.out.println("Model");
        String mod = myScanner.nextLine();

        System.out.println("Owner");
        String owner = myScanner.nextLine();

        //set cellphone data on object
        myPhone.setSerialNumber(Integer.parseInt(sN));
        myPhone.setModel(mod);
        myPhone.setCarrier(car);
        myPhone.setPhoneNumber(pn);
        myPhone.setOwner(owner);

        //use getter to display information

        System.out.println("The Serial number is:" + myPhone.getSerialNumber());
        System.out.println("The Model is:" + myPhone.getModel());
        System.out.println("The Carrier is:" + myPhone.getCarrier());
        System.out.println("The Phone Number is:" + myPhone.getPhoneNumber());
        System.out.println("The Owner is:" + myPhone.getOwner());
        // New cell phone
        CellPhone iPhone = new CellPhone();
        iPhone.setPhoneNumber("123-456-7890");
        iPhone.setOwner("Carl Johnson");

        System.out.println("iPhone");








        }




    }

