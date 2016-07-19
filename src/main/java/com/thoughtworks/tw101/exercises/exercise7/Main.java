package com.thoughtworks.tw101.exercises.exercise7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // read in input
        int num = Integer.parseInt(br.readLine());

        while(num!=target) {
            // give user feedback on their guess: too high/low/perfect
            game.checkGuess(num, target);
            // get next user input
            num = Integer.parseInt(br.readLine());
        }

        // once out of the while loop, you guessed correctly
        System.out.println("Congrats, you win! The target was: " + target + ".");

    }
}
