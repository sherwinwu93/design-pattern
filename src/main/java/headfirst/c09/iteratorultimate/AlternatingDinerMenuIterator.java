package headfirst.c09.iteratorultimate;

import headfirst.c09.iterator.Iterator;

import java.util.Calendar;

/**
 * @author Wusd
 * @date 2025/8/27
 * @description
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
