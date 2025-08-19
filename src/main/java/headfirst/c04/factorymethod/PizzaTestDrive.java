package headfirst.c04.factorymethod;

import headfirst.c04.factorymethod.pizza.Pizza;
import headfirst.c04.factorymethod.pizzastore.ChicagoPizzaStore;
import headfirst.c04.factorymethod.pizzastore.NYPizzaStore;
import headfirst.c04.factorymethod.pizzastore.PizzaStore;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
