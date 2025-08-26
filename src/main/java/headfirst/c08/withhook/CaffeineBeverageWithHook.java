package headfirst.c08.withhook;

/**
 * @author Wusd
 * @date 2025/8/26
 * @description
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    // 这是个hook
    boolean customerWantsCondiments() {
        return true;
    }
}
