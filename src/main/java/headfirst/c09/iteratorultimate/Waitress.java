package headfirst.c09.iteratorultimate;

import java.util.Iterator;

public class Waitress {
    // 减少了Waitress和具体类的依赖
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    // 打印出菜单的每一项
    public void printMenu() {
        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
        Iterator lunchIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }
    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem =(MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
