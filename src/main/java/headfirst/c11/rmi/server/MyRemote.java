package headfirst.c11.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Wusd
 * @date 2025/9/5
 * @description
 */
public interface MyRemote extends Remote {
    // 所有方法都必须抛出 RemoteException
    // 返回值必须可序列化(implement Serializable 或 基本类型)
    String sayHello() throws RemoteException;
}
