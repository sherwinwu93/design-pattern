package headfirst.c05.hungryman;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    // JVM会确保单例
    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static synchronized ChocolateBoiler getInstance() {
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // ...放牛奶和巧克力
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // ...倒出煮沸的牛奶和巧克力
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // ...把牛奶和巧克力煮沸
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
