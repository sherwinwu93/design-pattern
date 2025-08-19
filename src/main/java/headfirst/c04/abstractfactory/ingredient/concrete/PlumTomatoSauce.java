package headfirst.c04.abstractfactory.ingredient.concrete;

import headfirst.c04.abstractfactory.ingredient.Sauce;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class PlumTomatoSauce implements Sauce {
    @Override
    public String name() {
        return "PlumTomatoSauce";
    }
}
