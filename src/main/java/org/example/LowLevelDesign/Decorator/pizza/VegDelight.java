package org.example.LowLevelDesign.Decorator.pizza;

import org.example.LowLevelDesign.Decorator.pizza.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
