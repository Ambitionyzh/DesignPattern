package com.java.agentmode;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/12 9:47
 */
public interface MyRemote extends Remote {
    public String sayHelloo() throws RemoteException;
}
