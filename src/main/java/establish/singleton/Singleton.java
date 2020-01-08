package establish.singleton;

/**
 * IoDH
 * @author wusd
 * @date 2020/1/8 23:54
 */
public class Singleton {
    private Singleton() {}

    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
