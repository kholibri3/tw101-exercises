package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        // keep track of area sum, initialize to 0
        float totalArea = 0;

        // iterate over array of rectangles and find total area
        for(int i = 0; i<rectangles.length; i++) {
           totalArea+=rectangles[i].area();
        }

        // divide by number of rectangles (ie. array's length) to calc average area
        float avgArea = totalArea/rectangles.length;
        return avgArea;

    }
}
