package headfirst.c08.v11;

/**
 * @author Wusd
 * @date 2025/8/26
 * @description
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
