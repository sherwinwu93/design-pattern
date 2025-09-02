package headfirst.c09.iterator;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class MenuTestDriver {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
