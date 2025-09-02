package headfirst.c09.componentleafcomposite;

import java.util.Iterator;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description menuComponent 两个角色 Menu和MenuItem
 */
public abstract class MenuComponent {
    // start----------------------组合方法------------------------
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    // end----------------------组合方法------------------------

    // start----------------------操作方法------------------------
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
    // end----------------------操作方法------------------------

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
