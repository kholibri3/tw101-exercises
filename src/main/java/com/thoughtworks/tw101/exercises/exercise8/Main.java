package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        Game game = new Game();

        // the number for the user to guess
        int target = game.generateRandomNum();

        // set up some statements as initial UI for the guessing game
        System.out.println("Let's play a game! I'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess what it is?");
        System.out.println("Enter a number and then press 'Enter' to guess.");

        // for testing purposes
        // System.out.println(target);

        int num;

        while(true) {
            try{
                // read in input
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                num = Integer.parseInt(br.readLine());
                // check to see if user input was too high/low/perfect
                game.checkGuess(num, target);
                if(game.getGameOver()) {
                    br.close();
                    break;
                }

            } catch (NumberFormatException e){
                // takes care of letters, punctuation, ...
                System.out.println("* Number Format Exception! You did not enter a number to guess. Please try again.");
            }
        }
    }
}
