package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape square = new Square(10, 5);
        square.draw();

        Shape squareClone = square.cloneObject();
        squareClone.draw();
    }
}
