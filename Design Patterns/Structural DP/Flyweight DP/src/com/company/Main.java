package com.company;

public class Main {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
	// write your code here
        for (int i=0; i<20; ++i){
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setRadius(60);
            circle.draw();
        }

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
}
