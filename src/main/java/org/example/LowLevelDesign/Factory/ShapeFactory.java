package org.example.LowLevelDesign.Factory;

public class ShapeFactory {

    public Shape getShape(String shape) {
        switch (shape){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
