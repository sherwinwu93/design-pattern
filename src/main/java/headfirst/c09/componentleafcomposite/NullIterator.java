package headfirst.c09.componentleafcomposite;

import java.util.Iterator;

/**
 * @author Wusd
 * @date 2025/9/2
 * @description
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
