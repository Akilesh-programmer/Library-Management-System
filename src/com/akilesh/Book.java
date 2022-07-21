package com.akilesh;

public class Book {

    // Attributes
    private String title;
    private String author;
    private String publisher;
    private String type;
    private int year;
    private int pages;
    private double cost;
    private boolean isIn; // Can track if the book is in library or is with someone else.
    private String nameOfBookHolder; // Holds the name of the person who is currently having the book.
    private String phoneNumberOfBookHolder;
    private int tokenNumberOfBookHolder;

    // Constructor
    public Book(String title, String author, String publisher, String type, int year, int pages, double cost) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
        isIn = true;
        nameOfBookHolder = "";
        phoneNumberOfBookHolder = "null";
        tokenNumberOfBookHolder = -1;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getCost() {
        return cost;
    }

    public boolean isIn() {
        return isIn;
    }

    public String getNameOfBookHolder() {
        return nameOfBookHolder;
    }

    public String getPhoneNumberOfBookHolder() {
        return phoneNumberOfBookHolder;
    }

    public int getTokenNumberOfBookHolder() {
        return tokenNumberOfBookHolder;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCost (double cost) {
        this.cost = cost;
    }

    public void setIn(boolean in) {
        isIn = in;
    }

    public void setNameOfBookHolder(String nameOfBookHolder) {
        this.nameOfBookHolder = nameOfBookHolder;
    }

    public void setPhoneNumberOfBookHolder(String phoneNumberOfBookHolder) {
        this.phoneNumberOfBookHolder = phoneNumberOfBookHolder;
    }

    public void setTokenNumberOfBookHolder(int tokenNumberOfBookHolder) {
        this.tokenNumberOfBookHolder = tokenNumberOfBookHolder;
    }

    // Functions
    public void lendBook(String nameOfBookHolder, String phoneNumberOfBookHolder, int tokenNumberOfBookHolder) {
        this.nameOfBookHolder = nameOfBookHolder;
        this.phoneNumberOfBookHolder = phoneNumberOfBookHolder;
        this.tokenNumberOfBookHolder = tokenNumberOfBookHolder;
        this.isIn= false;
    }

    public void returnBook() {
        isIn = true;
        nameOfBookHolder = "";
        phoneNumberOfBookHolder = "null";
        tokenNumberOfBookHolder = -1;
    }
}