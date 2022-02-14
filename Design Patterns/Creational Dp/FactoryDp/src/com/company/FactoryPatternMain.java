package com.company;

public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactory ShapeFactory = new ShapeFactory();

        Shape shape1 = ShapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("Square");
        shape3.draw();
    }
}
