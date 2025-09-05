package headfirst.c11.old;

/**
 * @author Wusd
 * @date 2025/9/4
 * @description
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: GumballMachine <location> <inventory>");
            System.exit(1);
        }

        GumballMachine gumballMachine = new GumballMachine(args[0], Integer.parseInt(args[1]));
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        monitor.report();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        monitor.report();
    }
}
