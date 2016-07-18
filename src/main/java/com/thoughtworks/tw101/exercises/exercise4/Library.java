package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {

    // instance variables for the library to allow book titles to be printed
    private String[] books;
    private PrintStream printStream;

    // constructor with book titles and printStream passed
    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    // if books contain the keyword specified, then use printstream to display
    public void printBooksContaining(String partialBookTitle) {
        for(int i=0; i<books.length; i++) {
            if(books[i].contains(partialBookTitle))
                printStream.println(books[i]);
        }
    }
}
