package org.example.LowLevelDesign.Decorator.toppingsdecorator;

import org.example.LowLevelDesign.Decorator.pizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
