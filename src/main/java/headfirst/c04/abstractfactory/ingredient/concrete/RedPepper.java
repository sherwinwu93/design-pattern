package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Veggie;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class RedPepper implements Veggie {
    @Override
    public String name() {
        return "RedPepper";
    }
}
