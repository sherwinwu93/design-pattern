package headfirst.c05.old;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    // 两个线程拿到两个不同的实例
    // if(uniqueInstance == null)
    //                                            if(uniqueInstance == null)
    // uniqueInstance = new ChocolateBoiler();
    // return uniqueInstance;
    //                                             uniqueInstance = new ChocolateBoiler();
    //                                             return uniqueInstance;
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
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
