package headfirst.c09.iteratorultimate;

import java.util.ArrayList;

/**
 * @author Wusd
 * @date 2025/8/27
 * @description
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList< Menu> menus = new ArrayList<>();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        menus.add(pancakeHouseMenu);
        DinerMenu dinerMenu = new DinerMenu();
        menus.add(dinerMenu);
        CafeMenu cafeMenu = new CafeMenu();
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
