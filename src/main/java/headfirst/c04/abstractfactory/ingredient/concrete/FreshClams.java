package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Clams;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class FreshClams implements Clams {

    @Override
    public String name() {
        return "FreshClams";
    }
}
