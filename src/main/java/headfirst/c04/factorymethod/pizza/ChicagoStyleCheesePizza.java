package headfirst.c04.factorymethod.pizza;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
