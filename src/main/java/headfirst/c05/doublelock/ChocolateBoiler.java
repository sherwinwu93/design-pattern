package headfirst.c05.doublelock;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
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
