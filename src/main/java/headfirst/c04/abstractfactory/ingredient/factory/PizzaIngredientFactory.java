package headfirst.c04.abstractfactory.ingredient.factory;

import headfirst.c04.abstractfactory.ingredient.*;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
