package headfirst.c11.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description 继承了UnicastRemoteObject, 才能实现远程功能,超类会帮你做到这些事
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Now, say my name";
    }
}
