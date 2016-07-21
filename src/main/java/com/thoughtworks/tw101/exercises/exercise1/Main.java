package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

class PrintOdd {

    private int totalSum = 0;

    public void iterateSum() {
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i + "    ");
                totalSum+=i;
                System.out.println("Current Sum: " + totalSum);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPrinting odd numbers from 1 to 100 and their sum...\n");
        PrintOdd odds = new PrintOdd();
        odds.iterateSum();

        System.out.println("DONE!\n");
    }

}
