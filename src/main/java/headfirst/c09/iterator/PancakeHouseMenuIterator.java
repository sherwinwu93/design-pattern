package headfirst.c09.iterator;

import java.util.ArrayList;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null)
            return false;
        else return true;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
