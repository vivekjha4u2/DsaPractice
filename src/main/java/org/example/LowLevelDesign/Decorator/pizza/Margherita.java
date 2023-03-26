package org.example.LowLevelDesign.Decorator.pizza;

import org.example.LowLevelDesign.Decorator.pizza.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
