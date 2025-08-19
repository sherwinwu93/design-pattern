package headfirst.c04.abstractfactory.pizza;

import headfirst.c04.abstractfactory.ingredient.*;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                display.append(veggies[i] + "\n");
            }
        }
        if (clam != null) {
            display.append(clam + "\n");
        }
        return display.toString();
     }
}
