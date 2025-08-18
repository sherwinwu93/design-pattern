package headfirst.c03.decoration;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    // 饮料 + 小料
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        // 自身的钱+饮料的钱
        return .20 + beverage.cost();
    }
}
