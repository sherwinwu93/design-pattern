package headfirst.c01.duck;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class Duckcall {
    QuackBehavior quackBehavior;

    public Duckcall() {
        quackBehavior = new Squeak();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
