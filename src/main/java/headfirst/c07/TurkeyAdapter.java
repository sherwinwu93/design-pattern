package headfirst.c07;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
// 火鸡适配器用来冒充鸭子,里面实际行为是火鸡
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
