package headfirst.c09.iteratorultimate;

import java.util.Iterator;

/**
 * @author Wusd
 * @date 2025/8/27
 * @description
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    public MenuItem next() {
        return items[position++];
    }
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                ("You can't remove an item until you've done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
