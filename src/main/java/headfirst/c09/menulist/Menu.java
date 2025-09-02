package headfirst.c09.menulist;

import java.util.Iterator;

public interface Menu {
    public Iterator createIterator();

    // addItem还是让菜单类来完成
}
