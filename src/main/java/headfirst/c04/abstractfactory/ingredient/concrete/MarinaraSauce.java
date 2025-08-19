package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Sauce;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class MarinaraSauce implements Sauce {

    @Override
    public String name() {
        return "Marinara Sauce";
    }
}
