package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    // tally up how many times increment method is called, initialize to 0
    private int count = 0;

    public void increment() {
        System.out.println("Increment method called!");
        // add to tally
        count++;
    }

    public void total() {
        System.out.println("How many times was increment() called? ");
        // print count variable to get final tally
        System.out.println("Total: " + count);
    }
}
