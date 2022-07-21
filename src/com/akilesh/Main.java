package com.akilesh;

public class Main {

    public static void main(String[] args) {

        // TODO Create book class
        // TODO Create class to work with database, it should print everything is asked, and should have all functions
                // TODO related to CRUD.
        // TODO CRUD book to database
        // TODO never ending while loop to access everything
        // TODO program should not crash with invalid input
        // TODO create validation for the token number when entered

        // Test Cases for Book class
        Book book = new Book("Harry Potter", "J K Rowling", "Bloomsbury Publishing",
                "Fiction", 2002, 250, 10.00);
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Publisher : " + book.getPublisher());
        System.out.println("Type : " + book.getType());
        System.out.println("Year : " + book.getYear());
        System.out.println("Pages : " + book.getPages());
        System.out.println("Cost : " + book.getCost());
        book.setTitle("Nothing");
        book.setAuthor("No One");
        book.setPublisher("No One");
        book.setType("Nothing");
        book.setYear(0);
        book.setPages(0);
        book.setCost(0);
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Publisher : " + book.getPublisher());
        System.out.println("Type : " + book.getType());
        System.out.println("Year : " + book.getYear());
        System.out.println("Pages : " + book.getPages());
        System.out.println("Cost : " + book.getCost());
// ---------------------------------------------------------------------------------------------------------------------
    }
}
