package headfirst.c10;

/**
 * @author Wusd
 * @date 2025/9/4
 * @description
 */
public class GumballMachine {
    // 售罄
    final static int SOLD_OUT = 0;
    // 没钱
    final static int NO_QUARTER = 1;
    // 有钱
    final static int HAS_QUARTER = 2;
    // 正在出糖果
    final static int SOLD = 3;

    // 糖果机状态
    int state = SOLD_OUT;
    // 糖果库存
    int count = 0;

    // 初始化糖果库存
    public GumballMachine(int count) {
        this.count = count;
        state = count > 0 ? NO_QUARTER : SOLD_OUT;
    }

    // 投币
    public void insertQuarter() {
        if (state == NO_QUARTER) {
            // 没硬币,则状态改为有硬币
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == HAS_QUARTER) {
            // 已经有硬币,则拒绝投币,不变
            System.out.println("You can't insert another quarter");
        } else if (state == SOLD_OUT) {
            // 售罄,则拒绝投币,不变
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD) {
            // 正在出糖果,则拒绝投币,不变
            System.out.println("Please wait, we're already giving you a gumball");
        }
    }

    // 退币
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            // 有币,则退币,且状态改为没硬币
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            // 没币,则拒绝退币,不变
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD) {
            // 正在出糖果,则拒绝退币,不变
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT) {
            // 售罄,则拒绝退币,不变
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    // 转把手
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            // 有币,状态改为正在出糖果,发放糖果
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        } else if (state == SOLD) {
            // 正在出糖果,则拒绝转手,不变
            System.out.println("Turning twice doesn't get you another gumball");
        } else if (state == NO_QUARTER) {
            // 没币,则拒绝转手,不变
            System.out.println("You turned, but there's no quarter");
        } else if (state == SOLD_OUT) {
            // 售罄,则拒绝转手,不变
            System.out.println("You turned, but there's no gumballs");
        }
    }

    // 发放糖果,是机器内部的调用
    private void dispense() {
        // 只有正在出糖果,才发放糖果
        if (state == SOLD) {
            // 出糖果,减库存,如果库存为0,则状态改为售罄,否则状态改为没硬币
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
