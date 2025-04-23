package com.pluralsight;

import java.util.Scanner;

public class BookLibrary {
    static Book[] theBooks = {
            new Book(1, "1111", "Mondays 1"),
            new Book(2, "2222", "Monday 2"),
            new Book(3, "3333", "Monday 3"),
            new Book(4, "4444", "Monday 4"),
            new Book(5, "5555", "Monday 5"),
            new Book(1, "6666", "Mondays 6"),
            new Book(2, "7777", "Monday 7"),
            new Book(3, "8888", "Monday 8"),
            new Book(4, "9999", "Monday 9"),
            new Book(5, "1010", "Monday 10"),
            new Book(1, "1212", "Mondays 11"),
            new Book(2, "1313", "Monday 12"),
            new Book(3, "1414", "Monday 13"),
            new Book(4, "1515", "Monday 14"),
            new Book(5, "1616", "Monday 15"),
            new Book(1, "1717", "Mondays 16"),
            new Book(2, "1818", "Monday 17"),
            new Book(3, "1919", "Monday 18"),
            new Book(4, "2020", "Monday 19"),
            new Book(5, "2121", "Monday 20")
    };

    static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean Running = true;

        while(Running) {

            int userMainMenuChoice = mainMenu();

            switch (userMainMenuChoice) {

                case 1:

                    int userBookChoice = viewAvailableBooks();



                    if(userBookChoice == -1){
                        continue;
                    }


                    if (userBookChoice < theBooks.length) {

                        Scanner.nextLine();

                        System.out.println("What is your name?");
                        String usersName = Scanner.nextLine();


                        theBooks[userBookChoice].checkOut(usersName);

                    }else{
                        System.out.println("invalid book choice");
                        continue;
                    }

                    break;
                case 2:

                    int bookToReturn = viewCheckedOutBooks();

                    //this means they selected, go back to the home screen
                    if(bookToReturn == -1){
                        continue;
                    }

                    //the user wanted to check out a book
                    if (bookToReturn < theBooks.length) {
                        //eat the newline
                        Scanner.nextLine();

                        //checkout the book
                        theBooks[bookToReturn].checkIn();

                        //Ask them their name
                        System.out.println(theBooks[bookToReturn].getTitle() + "has been returned!");



                    }else{
                        System.out.println("invalid book choice");
                        continue;
                    }

                    break;
                case 3:
                    System.out.println("the user hates the library and wants to leave");
                    Running = false;
                    break;
                default:
                    System.out.println("Invalid Choice");


            }

        }

    }

    static int mainMenu(){

        System.out.println("Welcome to the library:\n");
        System.out.println("What would you like to do?");
        System.out.println("1: View Available Books");
        System.out.println("2: View checkout out Books");
        System.out.println("3: Exit the library");

        return Scanner.nextInt();


    }

    static int viewAvailableBooks(){

        System.out.println("These are the available books!\n");

        //loop over the books and work with each book
        for (int i = 0; i < theBooks.length; i++) {

            //set the current book to a variable so we dont have to deal with "i" anymore
            Book currentBook = theBooks[i];

            if(currentBook.isCheckedOut() == false){
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn());
            }

        }

        //eat the random line
        Scanner.nextLine();

        //would you like to check out a book
        System.out.println("\nWould you like to check out a book? (y/n)");
        String userSelection = Scanner.nextLine();

        //if th user says yes then ask them which book
        if(userSelection.equalsIgnoreCase("y")){
            System.out.println("Please enter the id of the book you want to check out:");
            return Scanner.nextInt();
        }

        //return -1 if no book selected, its easy to test for
        return -1;

    }

    static int viewCheckedOutBooks(){

        System.out.println("These are the checked-out books!\n");

        //loop over the books and work with each book
        for (int i = 0; i < theBooks.length; i++) {

            //set the current book to a variable so we dont have to deal with "i" anymore
            Book currentBook = theBooks[i];

            if(currentBook.isCheckedOut()){
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn() + " - checked-out to " + currentBook.getCheckedOutTo());
            }

        }

        //eat the random line
        Scanner.nextLine();

        //would you like to check out a book
        System.out.println("\nWould you like to do?\n");
        System.out.println("(C) check-in a book?");
        System.out.println("(X) go back to the main screen\n");
        String userSelection = Scanner.nextLine();

        //if th user says yes then ask them which book
        if(userSelection.equalsIgnoreCase("c")){
            System.out.println("Please enter the id of the book you want to return:");
            return Scanner.nextInt();
        }


        return -1;

    }

}
}
