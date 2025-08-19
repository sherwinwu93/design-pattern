package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Pepperoni;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class SlicedPepperoni implements Pepperoni {
    @Override
    public String name() {
        return "Sliced Pepperoni";
    }
}
