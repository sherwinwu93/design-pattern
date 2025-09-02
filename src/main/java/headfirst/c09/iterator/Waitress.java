package headfirst.c09.iterator;

public class Waitress {
    // 仍然和具体的菜单绑定
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    // 打印出菜单的每一项
    public void printMenu() {
        Iterator breakfastIterator = pancakeHouseMenu.createIterator();
        Iterator lunchIterator = dinerMenu.createIterator();
        System.out.println("Menu\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
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
