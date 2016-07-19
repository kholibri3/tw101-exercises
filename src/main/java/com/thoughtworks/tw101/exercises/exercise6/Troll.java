package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Katie on 7/18/16.
 */
public class Troll implements Monster {

    // initialize the name and number of hit points
    private String name = "Troll";
    private int hp = 40;

    @Override
    public void takeDamage(int amount) {
        // since trolls only take half the damage: 10pts really means 5pts of damage
        int halfAmount = amount/2;
        hp-=halfAmount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hp + " hit points left");
    }
}
