package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Espresso extends Beverage {
    public Espresso(int size) {
        description = "Espresso";
        this.size = size;
    }

    public double cost() {
        if (getSize() == Beverage.TALL) {
            return  .10;
        } else if (getSize() == Beverage.GRANDE) {
            return  .15;
        } else if (getSize() == Beverage.VENTI) {
            return  .20;
        }
        return 0;
    }
}
