package headfirst.c09.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wusd
 * @date 2025/8/29
 * @description 煎饼屋菜单
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs, and toast",
            true,
            2.99);
        addItem("Regular Pancake Breakfast",
            "Pancakes with fried eggs, sausage",
            false,
            2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Wallfles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }
    public void addItem(String name, String description,
                     boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
