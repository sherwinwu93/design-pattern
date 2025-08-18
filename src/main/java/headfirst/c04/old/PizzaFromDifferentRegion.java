package headfirst.c04.old;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class PizzaFromDifferentRegion {
    public static void main(String[] args) {
        SimplePizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("Veggie");

        SimplePizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(nyFactory);
        chicagoStore.orderPizza("Veggie");
    }
}
