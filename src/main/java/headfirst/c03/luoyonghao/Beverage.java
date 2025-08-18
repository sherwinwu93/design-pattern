package headfirst.c03.luoyonghao;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class Beverage {
    public static final int TALL = 1;
    public static final int GRANDE = 2;
    public static final int VENTI = 3;
    String description = "Unknown Beverage";
    int size;
    public String getDescription() {
        return description;
    }
    public int getSize() {
        return size;
    }
    public abstract double cost();
}
