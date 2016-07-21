package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private static int count = 0;

    public void increment() {
        System.out.println("Increment method called!");
        count++;
    }

    public void total() {
        System.out.println("How many times was increment() called? ");
        System.out.println("Total: " + count);
    }
}
