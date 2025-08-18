package headfirst.c03.decoration;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
