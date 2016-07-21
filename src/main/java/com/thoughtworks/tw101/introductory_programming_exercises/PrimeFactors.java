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

        // 2 will be a prime factor for all evens
        while(n%2==0) {
            factors.add(2);
            n/=2;
        }

        //loop through odd
        for(int i=3; i<temp; i=i+2) {
            while(n%i==0) {
                factors.add(i);
                n/=i;
            }
        }

        return factors;
    }
}
