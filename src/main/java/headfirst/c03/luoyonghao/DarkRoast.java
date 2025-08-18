package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class DarkRoast extends Beverage {
    public DarkRoast(int size)
    {
        description = "Dark Roast Coffee";
        this.size = size;
    }
    public double cost()
    {
        return .99;
    }
}
