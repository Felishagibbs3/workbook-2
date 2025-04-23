package com.pluralsight;

import javax.xml.namespace.QName;

public class Book {
// private to restrict access
    private int iD;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    //overloaded constructor

   public Book(int iD, String isbn, String title) {
       this.iD = iD;
       this.isbn = isbn;
       this.title = title;

       this.isCheckedOut = false;
       this.checkedOutTo = "";


   }
public void checkOut(String name){
       this.setCheckedOut(true);
       this.setCheckedOutTo(name);
}
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}

