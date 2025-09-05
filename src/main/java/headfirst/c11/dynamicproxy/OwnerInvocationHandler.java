package headfirst.c11.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) {
                // get不做限制
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                // 本人不允许评分
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
