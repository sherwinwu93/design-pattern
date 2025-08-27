package headfirst.c09.old;

import java.util.ArrayList;

/**
 * @author Wusd
 * @date 2025/8/27
 * @description
 */
public class Waitress {
    String name = "Alice";
    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastMenu = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchMenu = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastMenu.size(); i++) {
            MenuItem menuItem = (MenuItem)breakfastMenu.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        for (int i = 0; i < lunchMenu.length; i++) {
            MenuItem menuItem = lunchMenu[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
    public void printBreakfastMenu() {
    }
    public void printLunchMenu() {

    }
    public void printVegetarianMenu() {
    }
    public boolean isItemVegetarian(String name) {
        return false;
    }
}
