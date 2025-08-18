package headfirst.c03.decoration;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public abstract class CondimentDecorator extends Beverage {
    // 调料装饰者必须重新实现getDescription
    public abstract String getDescription();
}
