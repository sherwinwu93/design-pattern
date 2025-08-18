package headfirst.c04.better.pizzastore;

import headfirst.c04.better.pizza.ChicagoStyleCheesePizza;
import headfirst.c04.better.pizza.ChicagoStyleGreekPizza;
import headfirst.c04.better.pizza.ChicagoStylePepperoniPizza;
import headfirst.c04.better.pizza.NYStylePizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class ChicagoPizzaStore extends PizzaStore {
    NYStylePizza createPizza(String type) {
        NYStylePizza pizza;
        if (type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else if (type.equals("greek"))
            pizza = new ChicagoStyleGreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new ChicagoStylePepperoniPizza();
        else pizza = null;
        return pizza;
    }
}
