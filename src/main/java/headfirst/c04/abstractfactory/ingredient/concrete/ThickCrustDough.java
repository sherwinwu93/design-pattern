package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Dough;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class ThickCrustDough implements Dough {
    @Override
    public String name() {
        return "ThickCrustDough";
    }
}
