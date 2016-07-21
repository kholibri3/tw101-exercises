package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float totalArea = 0;

        for(int i = 0; i<rectangles.length; i++) {
           totalArea+=rectangles[i].area();
        }
        float avgArea = totalArea/rectangles.length;
        return avgArea;

    }
}
