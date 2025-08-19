package headfirst.c04.abstractfactory.pizzastore;

import headfirst.c04.abstractfactory.ingredient.factory.ChicagoPizzaIngredientFactory;
import headfirst.c04.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import headfirst.c04.abstractfactory.pizza.CheesePizza;
import headfirst.c04.abstractfactory.pizza.ClamPizza;
import headfirst.c04.abstractfactory.pizza.Pizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}
