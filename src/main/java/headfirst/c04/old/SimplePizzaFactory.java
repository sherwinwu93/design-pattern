package headfirst.c04.old;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else pizza = null;
        return pizza;
    }
}
