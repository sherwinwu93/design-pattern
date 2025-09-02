package headfirst.c09.iteratorultimate;

import headfirst.c09.iterator.Iterator;

import java.util.Calendar;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else return true;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }
}
