package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Cheese;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class MozzarellaCheese implements Cheese {
    @Override
    public String name() {
        return "MozzarellaCheese";
    }
}
