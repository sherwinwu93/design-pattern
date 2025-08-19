package headfirst.c04.abstractfactory.pizzastore;

import headfirst.c04.abstractfactory.pizza.*;
import headfirst.c04.abstractfactory.ingredient.factory.NYPizzaIngredientFactory;
import headfirst.c04.abstractfactory.ingredient.factory.PizzaIngredientFactory;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
