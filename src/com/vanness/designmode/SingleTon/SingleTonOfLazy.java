package com.vanness.designmode.SingleTon;

import java.io.Serializable;

/**
 * 单例模式（懒汉模式）：在声明静态变量的时候，不初始化类实例，在获取单例的时候才初始化实例（延迟加载），当单例对象占用内存
 * 过大时，可以提高性能，但是存在线程不安全的问题
 * 1、私有化构造函数
 * 2、创建一个静态的类实例变量
 * 3、对外提供一个getInstance方法，返回2中的静态实例变量
 */
public class SingleTonOfLazy implements Serializable{
    private static SingleTonOfLazy instance;

    private SingleTonOfLazy() {
        if (instance != null) {
            //如果不是第一次构建，则直接抛出异常。不让创建（该方法可以防止反射破坏单例）
            throw new RuntimeException();
        }
    }

    public static SingleTonOfLazy getInstance() {
        if(instance == null) {
            instance = new SingleTonOfLazy();
        }
        return instance;
    }

    private Object readResolve() throws Exception {
       return getInstance();
    }
}
