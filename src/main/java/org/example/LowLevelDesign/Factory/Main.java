package org.example.LowLevelDesign.Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("Rectangle");
        shape.draw();
    }
}
