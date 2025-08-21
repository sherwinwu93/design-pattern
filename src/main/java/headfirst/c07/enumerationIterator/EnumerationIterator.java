package headfirst.c07.enumerationIterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class EnumerationIterator<E> implements Iterator<E> {
    Enumeration<E> enumeration;
    public EnumerationIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public E next() {
        return enumeration.nextElement();
    }
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Iterator<String> iterator = new EnumerationIterator<>(list.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
