package headfirst.c11.old;

/**
 * @author Wusd
 * @date 2025/9/4
 * @description
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
