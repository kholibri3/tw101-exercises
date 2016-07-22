package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        int numSpaces = n;
        int numStars = 1;
        int counter = 0;

        for(int i=1; i<=n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, numSpaces, numStars, currentRow);
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
        int numSpaces = n;
        int numStars = 1;
        int counter = 0;
        int afterMiddleRow = 0;

        for(int i=1; i<=n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, numSpaces, numStars, currentRow);
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
            printRow(0, counter, numSpaces, numStars, currentRow);
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
        int numSpaces = n;
        int numStars = 1;
        int counter = 0;
        int afterMiddleRow = 0;

        for(int i=1; i<n; i++) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, numSpaces, numStars, currentRow);
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
        printSpaces(0, spacesAroundName, lineWithName);
        lineWithName.append("Katie");
        printSpaces(0, spacesAroundName, lineWithName);
        System.out.println(lineWithName.toString());

        for(int i=n-1; i>0; i--) {
            StringBuilder currentRow = new StringBuilder();
            printRow(0, counter, numSpaces, numStars, currentRow);
            System.out.println(currentRow.toString());
            counter = 0;
            numSpaces+=1;
            numStars-=2;
        }
    }

    // helper method for printing a row
    private static void printRow(int i, int count, int spaces, int stars, StringBuilder row) {
        printSpaces(i, spaces, row);
        printStars(count, stars, row);
        printSpaces(i, spaces, row);
    }

    // helper method for printing the spaces of rows for isoceles triangles and diamonds
    private static void printSpaces(int i, int numSpaces, StringBuilder currentRow) {
        for(i=0; i<numSpaces; i++) {
            currentRow.append(" ");
        }
    }

    // helper method for printing the stars of rows for isoceles triangles and diamonds
    private static void printStars(int count, int numStars, StringBuilder currentRow) {
        while(count!=numStars) {
            currentRow.append("*");
            count++;
        }
    }

}
