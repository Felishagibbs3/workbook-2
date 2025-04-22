package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Book[] inventory = new Book[20];

        for (int i = 0; i < inventory.length; i++) {
            inventory[i] = new Book(i + 1, "ISBN" + (1000 + i), "Book" + (i + 1));

        }
        boolean running = true;

        while (running) {
            System.out.println("1.  Books Available");
            System.out.println("2.  Books Checked Out");
            System.out.println("3.  Main menu");
            System.out.println("Selection Option");

            int choice = myScanner.nextInt();
            myScanner.nextLine();

            if (choice == 1) {
                System.out.println("\n --- Books Available for Checkout");
                for (Book book : inventory) {
                    if (!book.isCheckedOut()) {
                        System.out.println("ID: " + book.getiD() + ", IBSN: " + book.getIsbn() + ", Title:" + book.getTitle());

                    }
                }
            }
            System.out.println("Enter book ID to check out, or hit 0 to return");
            int bookId = myScanner.nextInt();
            String name = myScanner.nextLine();

            if (bookId != 0) {
                for (Book book : inventory) {
                    if (book.getiD() == bookId && !book.isCheckedOut()) {
                        System.out.println("Enter name");
                        String firstName = myScanner.nextLine();
                        book.setCheckedOutTo(name);
                        System.out.println("Book has been successfully checked out.");
                        break;


                    }
                }
            } else if (choice == 2) {
                System.out.println("Checked out books");
                for (Book book : inventory) {
                    if (book.isCheckedOut()) {
                        System.out.println("ID: " + book.getiD() + ", IBSN: " + book.getIsbn() + ", Title:" + book.getTitle() + ", Checked out to:" + book.getCheckedOutTo());
                    }


                }

                System.out.println("Enter C for checkout, X to return");
                String selection = myScanner.nextLine();

                if (selection.equalsIgnoreCase("C")) {
                    System.out.println("Enter book ID to check in.");

                    int checkInID = myScanner.nextInt();

                    myScanner.nextLine();

                    for (Book book : inventory) {
                        if (book.getiD() == checkInID) book.getCheckedOutTo();
                        {
                            book.checkIn();
                            System.out.println("Book has been checked in!");
                            break;
                        }
                    }
                }
            } else if (choice == 3) {
                running = false;
                System.out.println("Goodbye");
            } else {
                System.out.println("Please try again.");
            }


        }