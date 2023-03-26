package org.example.LowLevelDesign.Decorator;

import org.example.LowLevelDesign.Decorator.pizza.BasePizza;
import org.example.LowLevelDesign.Decorator.pizza.Farmhouse;
import org.example.LowLevelDesign.Decorator.toppingsdecorator.ExtraCheese;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Farmhouse());
        System.out.println(pizza.cost());
    }
}
