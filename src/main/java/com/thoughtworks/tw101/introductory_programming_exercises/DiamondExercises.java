package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    private static int numSpaces;
    private static int numStars;
    private static int counter;

    public static int getNumSpaces() {
        return numSpaces;
    }

    public static int getNumStars() {
        return numStars;
    }

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    private static void setUpValues(int rows) {
        numSpaces = rows;
        numStars = 1;
        counter = 0;
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        setUpValues(n);
        for(int i=1; i<=n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            // adjust # spaces and stars for next row
            numSpaces-=1;
            numStars+=2;
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        setUpValues(n);
        int afterMiddleRow = 0;
        for(int i=1; i<=n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            numSpaces-=1;
            // save value to be repeated for the bottom half of the diamond
            if(i==n-1)
                afterMiddleRow = numStars;
            numStars+=2;
        }

        // adjust # spaces and stars for next row
        numSpaces = 2;
        numStars = afterMiddleRow;
        counter = 0;

        for(int i=n-1; i>0; i--) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            // adjust # spaces and stars for next row
            numSpaces+=1;
            numStars-=2;
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle currentRow. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        setUpValues(n);
        int afterMiddleRow = 0;
        for(int i=1; i<n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            numSpaces-=1;
            // save value to be repeated for the bottom half of the diamond
            if(i==n-1)
                afterMiddleRow = numStars;
            numStars+=2;
        }

        numSpaces = 2;
        int spacesAroundName = (numStars+numSpaces)/2-2;
        numStars = afterMiddleRow;
        counter = 0;

        StringBuilder lineWithName = new StringBuilder();
        printNameRow(spacesAroundName, lineWithName);
        System.out.println(lineWithName.toString());

        for(int i=n-1; i>0; i--) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            numSpaces+=1;
            numStars-=2;
        }
    }

    private static void printNameRow(int numSpacesAroundName, StringBuilder line) {
        for(int i=0; i<numSpacesAroundName; i++) {
            line.append(" ");
        }
        line.append("Katie");
        for(int i=0; i<numSpacesAroundName; i++) {
            line.append(" ");
        }
    }

    // helper method for printing a row
    private static void printRow(int i, int count, StringBuilder row) {
        printSpaces(i, row);
        printStars(count, row);
        printSpaces(i, row);
    }

    // helper method for printing the spaces of rows
    private static void printSpaces(int i, StringBuilder currentRow) {
        for(i=0; i<getNumSpaces(); i++) {
            currentRow.append(" ");
        }
    }

    // helper method for printing the stars of rows
    private static void printStars(int count, StringBuilder currentRow) {
        while(count!=getNumStars()) {
            currentRow.append("*");
            count++;
        }
    }
}
