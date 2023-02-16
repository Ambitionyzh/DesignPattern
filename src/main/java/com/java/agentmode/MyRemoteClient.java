package com.java.agentmode;

import java.rmi.Naming;

/**
 * @author yongzh
 * @version 1.0
 * @program: DesignPattern
 * @description:
 * @date 2023/2/12 9:53
 */
public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    public  void go(){
        try {
            MyRemote service =(MyRemote) Naming.lookup("rmi://127.0.0.1:33347/RemoteHello");
            String s = service.sayHelloo();
            System.out.println(s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
