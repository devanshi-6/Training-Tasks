package com.company;

public class ShapeFactory {
    public Shape getShape(String Type){
        if (Type == null){
            return null;
        }
        if (Type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (Type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if (Type.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
