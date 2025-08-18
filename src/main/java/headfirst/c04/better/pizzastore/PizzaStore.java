package headfirst.c04.better.pizzastore;

import headfirst.c04.better.pizza.NYStylePizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class PizzaStore {


    public NYStylePizza orderPizza(String type) {
        NYStylePizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract NYStylePizza createPizza(String type);
}
