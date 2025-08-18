package headfirst.c03.decoration;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
