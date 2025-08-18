package headfirst.c03.better;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return super.cost() + 3.0;
    }
}
