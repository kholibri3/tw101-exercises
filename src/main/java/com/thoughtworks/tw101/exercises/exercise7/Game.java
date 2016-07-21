package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Random;

/**
 * Created by Katie on 7/18/16.
 */
public class Game {

    protected int generateRandomNum() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100 - 1 + 1) + 1;
        return randomNum;
    }

    protected void checkGuess(int numberUserGuessed, int numberForUserToGuess) {
        if(numberUserGuessed>numberForUserToGuess) {
            System.out.println("Sorry, you're guessing too high. Try again?");
        } else {
            System.out.println("Sorry, you're guessing too low. Try again?");
        }
    }
}
