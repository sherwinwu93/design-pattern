package headfirst.c05.doublelock;

/**
 * @author Wusd
 * @date 2025/8/19
 * @description
 */
public class Singleton {
    // volatile确保多个线程正确地知道这个变量的状态
    private volatile static Singleton uniqueInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (uniqueInstance == null){// 检查实例,如果不存在,则进入同步区
            synchronized (Singleton.class) {//只有第一次才会完全执行这里的代码
                if (uniqueInstance == null){//再检查一次,如果仍是null,才创建实例
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
