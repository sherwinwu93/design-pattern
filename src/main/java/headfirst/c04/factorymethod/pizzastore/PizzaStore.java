package headfirst.c04.factorymethod.pizzastore;

import headfirst.c04.factorymethod.pizza.Pizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
