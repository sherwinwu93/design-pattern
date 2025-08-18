package headfirst.c04.old;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza() {
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
//        if (type.equals("cheese"))
//            pizza = new CheesePizza();
//        else if (type.equals("greek"))
//            pizza = new GreekPizza();
//        else if (type.equals("pepperoni"))
//            pizza = new PepperoniPizza();
//        else return null;
        // 好处在于,工厂可以到处使用. 还有静态工厂
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
