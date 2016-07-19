package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Katie on 7/19/16.
 */
public class Game {

    private ArrayList<Integer> guesses = new ArrayList<Integer>();
    private boolean gameOver = false;

    protected int generateRandomNum() {
        Random rand = new Random();
        // generate number btwn 1-100
        int randomNum = rand.nextInt(100 - 1 + 1) + 1;
        return randomNum;
    }

    public boolean getGameOver(){
        return gameOver;
    }


    protected void checkGuess(int guess, int target) {
        if(guess==target) {
            System.out.println("Congrats, you win! The target was: " + target + ".");
            gameOver = true;
            // only print out all the previous guesses if they have any
            if(guesses.size()>=1) {
                System.out.println("Here are your previous guesses: ");
                System.out.println(guesses);
            } else{
                // otherwise
                System.out.println("You have no previous guesses to show. You guessed it on the first try!");
            }
        } else if(guess>target) {
            // add to the arraylist
            guesses.add(guess);
            // they guessed too high
            System.out.println("Sorry, you're guessing too high. Try again?");
        } else {
            // add to the arraylist
            guesses.add(guess);
            // must be too low
            System.out.println("Sorry, you're guessing too low. Try again?");
        }
    }
}
