package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors.toString());
    }

    private static List<Integer> generate(int n) {
        // save n here, before it changes in the for/while loops below
        int temp = n;
        List<Integer> factors = new ArrayList<Integer>();

        // until you can't divide it evenly in half anymore, bc 2 is likely to be a prime factor for many
        while(n%2==0) {
            // add 2 to the factors
            factors.add(2);
            n/=2;
        }

        //loop through odd numbers up until n
        for(int i=3; i<temp; i=i+2) {
            while(n%i==0) {
                // add this number to the factors
                factors.add(i);
                n/=i;
            }
        }
        // since the program starts with 2 and then increments through the odd numbers, it is guaranteed to be in increasing numerical order
        return factors;
    }
}
