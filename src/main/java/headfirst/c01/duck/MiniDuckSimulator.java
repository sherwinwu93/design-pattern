package headfirst.c01.duck;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
