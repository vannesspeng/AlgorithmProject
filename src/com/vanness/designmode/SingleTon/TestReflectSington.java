package com.vanness.designmode.SingleTon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestReflectSington {
    public static void main(String[] args) throws Exception {
        SingleTonOfLazy s1 = SingleTonOfLazy.getInstance();
        SingleTonOfLazy s2 = SingleTonOfLazy.getInstance();

        System.out.println(s1 == s2);//true

        //使用反射破坏了单例
        /*Class<SingleTonOfLazy> clazz = (Class<SingleTonOfLazy>)Class.forName(SingleTonOfLazy.class.getName());
        Constructor<SingleTonOfLazy> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        SingleTonOfLazy s3 = c.newInstance();
        SingleTonOfLazy s4 = c.newInstance();
        System.out.println(s3==s4);*/

        //使用序列化与反序列化破坏单例以及相应的处理办法
        SingleTonOfLazy s5 = SingleTonOfLazy.getInstance();

        FileOutputStream fos = new FileOutputStream("D:/SingleTon.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s5);
        oos.close();
        fos.close();

        //将对象反序列化回来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/SingleTon.txt"));
        SingleTonOfLazy s6 = (SingleTonOfLazy) ois.readObject();
        System.out.println(s5);
        System.out.println(s5 == s6);
    }
}
