package headfirst.c03.decoration;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }
    public double cost() {
        return 1.05;
    }
}
