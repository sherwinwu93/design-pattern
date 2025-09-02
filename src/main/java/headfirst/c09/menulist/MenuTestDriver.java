package headfirst.c09.menulist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class MenuTestDriver {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));

        Waitress waitress = new Waitress(arrayList);
        waitress.printMenu();
    }
}
