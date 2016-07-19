package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;

/**
 * Created by Katie on 7/18/16.
 */
public class Game {

    protected int generateRandomNum() {
        Random rand = new Random();
        // generate number btwn 1-100
        int randomNum = rand.nextInt(100 - 1 + 1) + 1;
        return randomNum;
    }

    protected void checkGuess(int guess, int target) {
        if(guess>target) {
            // they guessed too high
            System.out.println("Sorry, you're guessing too high. Try again?");
        } else {
            // must be too low
            System.out.println("Sorry, you're guessing too low. Try again?");
        }
    }
}
