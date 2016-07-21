package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    private int startVal;
    private int endVal;

    public void setStartVal(int startVal) {
        this.startVal = startVal;
    }
    public void setEndVal(int endVal) {
        this.endVal = endVal;
    }
    public void setInfo(int startVal, int endVal) {
        setStartVal(startVal);
        setEndVal(endVal);
    }

    public int getStartVal() {
        return startVal;
    }
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
