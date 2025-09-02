package headfirst.c09.componentleafcomposite;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                // 如果是Menu，则将Menu的迭代器压入栈中
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
