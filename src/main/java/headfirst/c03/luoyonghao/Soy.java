package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .10;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .15;
        } else if (getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
