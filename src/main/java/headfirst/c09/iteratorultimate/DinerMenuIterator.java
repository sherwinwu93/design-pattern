package headfirst.c09.iteratorultimate;

import java.util.Iterator;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
