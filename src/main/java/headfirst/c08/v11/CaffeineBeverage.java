package headfirst.c08.v11;

/**
 * @author Wusd
 * @date 2025/8/26
 * @description
 */
public abstract class CaffeineBeverage {
    // 模板方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
