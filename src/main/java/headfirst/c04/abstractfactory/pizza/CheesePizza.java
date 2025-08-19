package headfirst.c04.abstractfactory.pizza;

import headfirst.c04.abstractfactory.ingredient.factory.PizzaIngredientFactory;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
