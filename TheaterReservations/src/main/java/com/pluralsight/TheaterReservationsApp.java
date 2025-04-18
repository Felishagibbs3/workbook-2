package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservationsApp {

    public static void main(String[] args) {
        Scanner reservation = new Scanner(System.in);
        //ask for first and last name
        System.out.println("Enter first name");
        String firstName = reservation.nextLine();
        System.out.println("Enter last name");
        String lastName = reservation.nextLine();

        //ask for date of show
        System.out.println("What date would you like to attend show?");
        String date = reservation.nextLine();

        // ask for number of tickets
        System.out.println("How many tickets would you like?");
        int tickets = reservation.nextInt();

        //format tickets to reservation date on 2023-05-13 under Johnson, Geri
        String fName = "Geri";
        String lName = "Johnson";
        String ticketDate = "5/13/2023";
        int numOfTickets = 1;

        DateTimeFormatter formatter;


        DateTimeFormatter formatInput = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outPutFormat = DateTimeFormatter.ofPattern("yyyy-MM--dd");
        LocalDate dateofRerseve = LocalDate.parse(ticketDate, formatInput);
        String reserveDate = date.





        //display ticket
        System.out.println("Ticket reserved for: ");
        System.out.println("Last Name:" + lName + "," + " " + fName);
        System.out.println("Number of Tickets:" + numOfTickets);
        System.out.println("Date reserved for:" +





    }
}
