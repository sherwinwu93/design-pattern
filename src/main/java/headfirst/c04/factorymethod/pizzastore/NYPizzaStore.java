package headfirst.c04.factorymethod.pizzastore;

import headfirst.c04.factorymethod.pizza.NYStyleCheesePizza;
import headfirst.c04.factorymethod.pizza.NYStyleGreekPizza;
import headfirst.c04.factorymethod.pizza.NYStylePepperoniPizza;
import headfirst.c04.factorymethod.pizza.Pizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        Pizza pizza;
        if (item.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if (item.equals("greek"))
            pizza = new NYStyleGreekPizza();
        else if (item.equals("pepperoni"))
            pizza = new NYStylePepperoniPizza();
        else pizza = null;
        return pizza;
    }
}
