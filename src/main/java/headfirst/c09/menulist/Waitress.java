package headfirst.c09.menulist;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    // 打印出菜单的每一项
    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
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
