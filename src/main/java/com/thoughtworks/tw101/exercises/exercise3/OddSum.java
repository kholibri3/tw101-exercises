package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    // starting value
    private int startVal;

    // ending value
    private int endVal;

    // setter method for the starting value
    public void setStartVal(int startVal) {
        this.startVal = startVal;
    }

    // setter method for the ending value
    public void setEndVal(int endVal) {
        this.endVal = endVal;
    }

    // setter method for both starting & ending values
    public void setInfo(int startVal, int endVal) {
        setStartVal(startVal);
        setEndVal(endVal);
    }

    // getter method for starting value
    public int getStartVal() {
        return startVal;
    }

    // getter method for ending value
    public int getEndVal() {
        return endVal;
    }

    // iterating over odd numbers btwn starting and ending values, before adding up the sum
    public int of(int start, int end) {
        int sum = 0;

        for(int i=start; i<=end; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}
