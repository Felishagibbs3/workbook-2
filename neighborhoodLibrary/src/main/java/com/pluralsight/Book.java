package com.pluralsight;

public class Book {

    private int iD;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    //overloaded constructor

    public Book(int iD, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.iD = 0;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut = true;
        this.checkedOutTo = "";


    }

    public Book(int iD, String isbn, String title)
    {
    }

    // generated getters
    public int getiD() {
        return iD;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    // setters

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = true;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = "";
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }






    }

