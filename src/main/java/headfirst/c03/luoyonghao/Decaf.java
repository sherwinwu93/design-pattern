package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Decaf extends Beverage {
    public Decaf(int size) {
        description = "Decaf";
        this.size = size;
    }
    public double cost() {
        return 1.05;
    }
}
