package headfirst.c04.better.factory;

import headfirst.c04.better.pizza.NYStyleCheesePizza;
import headfirst.c04.better.pizza.NYStyleGreekPizza;
import headfirst.c04.better.pizza.NYStylePepperoniPizza;
import headfirst.c04.better.pizza.NYStylePizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class SimplePizzaFactory {
    public NYStylePizza createPizza(String type) {
        NYStylePizza pizza;
        if (type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if (type.equals("greek"))
            pizza = new NYStyleGreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new NYStylePepperoniPizza();
        else pizza = null;
        return pizza;
    }
}
