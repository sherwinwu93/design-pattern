package headfirst.c04.factorymethod.pizzastore;

import headfirst.c04.factorymethod.pizza.ChicagoStyleCheesePizza;
import headfirst.c04.factorymethod.pizza.ChicagoStyleGreekPizza;
import headfirst.c04.factorymethod.pizza.ChicagoStylePepperoniPizza;
import headfirst.c04.factorymethod.pizza.Pizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza;
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
