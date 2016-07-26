package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        Game game = new Game();

        System.out.println("Let's play a game! I'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess what it is?");
        System.out.println("Enter a number and then press 'Enter' to guess.");

        // for testing purposes
        // System.out.println(target);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!game.getGameOver()) {
            try{
                int input = Integer.parseInt(br.readLine());
                game.checkGuess(input);
            } catch (NumberFormatException e) {
                // takes care of letters, punctuation, ...
                System.out.println("* Number Format Exception! You did not enter a number to guess. Please try again.");
            }
        }
        br.close();
    }
}
