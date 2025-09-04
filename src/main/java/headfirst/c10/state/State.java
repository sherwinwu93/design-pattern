package headfirst.c10.state;

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
