package headfirst.c07;

import java.util.Random;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    int trys;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (++trys >= 5) {
            duck.fly();
            trys = 0;
        }
    }
}
