package headfirst.c09.iterator;

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
}
