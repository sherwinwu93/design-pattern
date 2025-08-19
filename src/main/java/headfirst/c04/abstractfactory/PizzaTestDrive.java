package headfirst.c04.abstractfactory;

import headfirst.c04.abstractfactory.pizza.Pizza;
import headfirst.c04.abstractfactory.pizzastore.ChicagoPizzaStore;
import headfirst.c04.abstractfactory.pizzastore.NYPizzaStore;
import headfirst.c04.abstractfactory.pizzastore.PizzaStore;

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
        System.out.println("pizza: " + pizza);

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
        System.out.println("pizza: " + pizza);
    }
}
