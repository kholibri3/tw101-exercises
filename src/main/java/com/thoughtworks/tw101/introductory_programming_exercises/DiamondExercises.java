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
            StringBuilder line = new StringBuilder();

            printSpaces(0, numSpaces, line);
            printStars(counter, numStars, line);
            printSpaces(0, numSpaces, line);

            System.out.println(line.toString());
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
            StringBuilder line = new StringBuilder();

            printSpaces(0, numSpaces, line);
            printStars(counter, numStars, line);
            printSpaces(0, numSpaces, line);

            System.out.println(line.toString());
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
            StringBuilder line = new StringBuilder();

            printSpaces(0, numSpaces, line);
            printStars(counter, numStars, line);
            printSpaces(0, numSpaces, line);

            System.out.println(line.toString());

            counter = 0;

            // adjust # spaces and stars for next row
            numSpaces+=1;
            numStars-=2;
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
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
            StringBuilder line = new StringBuilder();

            printSpaces(0, numSpaces, line);
            printStars(counter, numStars, line);
            printSpaces(0, numSpaces, line);

            System.out.println(line.toString());
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

        StringBuilder nameLine = new StringBuilder();
        printSpaces(0, spacesAroundName, nameLine);
        nameLine.append("Katie");
        printSpaces(0, spacesAroundName, nameLine);
        System.out.println(nameLine.toString());

        for(int i=n-1; i>0; i--) {
            StringBuilder line = new StringBuilder();

            printSpaces(0, numSpaces, line);
            printStars(counter, numStars, line);
            printSpaces(0, numSpaces, line);

            System.out.println(line.toString());
            counter = 0;
            numSpaces+=1;
            numStars-=2;
        }
    }

    // helper method for printing the spaces of rows for isoceles triangles and diamonds
    private static void printSpaces(int i, int numSpaces, StringBuilder line) {
        for(i=0; i<numSpaces; i++) {
            line.append(" ");
        }
    }

    // helper method for printing the stars of rows for isoceles triangles and diamonds
    private static void printStars(int count, int numStars, StringBuilder line) {
        while(count!=numStars) {
            line.append("*");
            count++;
        }
    }

}
