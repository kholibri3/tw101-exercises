package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();
        oddSum.setInfo(1, 100);

        int start = oddSum.getStartVal();
        int end = oddSum.getEndVal();
        int sum = oddSum.of(start, end);

        System.out.println("\nSum of all odd integers from " + start + " to " + end + ": " + sum);
        System.out.println("DONE!\n");
    }
}
