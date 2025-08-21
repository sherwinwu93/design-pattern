package headfirst.c07;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
