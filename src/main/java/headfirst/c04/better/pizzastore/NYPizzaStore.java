package headfirst.c04.better.pizzastore;

import headfirst.c04.better.pizza.NYStyleCheesePizza;
import headfirst.c04.better.pizza.NYStyleGreekPizza;
import headfirst.c04.better.pizza.NYStylePepperoniPizza;
import headfirst.c04.better.pizza.NYStylePizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class NYPizzaStore extends PizzaStore {
    NYStylePizza createPizza(String item) {
        NYStylePizza pizza;
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
