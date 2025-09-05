package headfirst.c11.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description
 */
public class Main {
    public static void main(String[] args) {
        PersonBean person = new PersonBeanImpl();
        person.setName("Sherwin");
        PersonBean ownerPerson = (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
        System.out.println();

        PersonBean nonOwnerPerson = (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
