package com.java.agentmode;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/12 9:47
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHelloo() throws RemoteException {
        return "Hello World!";
    }
    public static void main(String[] args){
        try {
            MyRemote service = new MyRemoteImpl();

            LocateRegistry.createRegistry(8088);
          //  System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Naming.rebind("RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
