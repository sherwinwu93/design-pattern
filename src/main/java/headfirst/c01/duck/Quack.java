package headfirst.c01.duck;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
