package headfirst.c11.rmi.server;

import java.rmi.Naming;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description
 */
public class MyRemoteServer {
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
