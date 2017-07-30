package com.vanness.designmode.SingleTon;

/**
 * 单例模式（懒汉模式）：在声明静态变量的时候，不初始化类实例，在获取单例的时候才初始化实例（延迟加载），当单例对象占用内存
 * 过大时，可以提高性能，但是存在线程不安全的问题
 * 1、私有化构造函数
 * 2、创建一个静态的类实例变量
 * 3、对外提供一个getInstance方法，返回2中的静态实例变量
 */
public class SingleTonOfLazy {
    private static SingleTonOfLazy instance;

    private SingleTonOfLazy() {}

    public static SingleTonOfLazy getInstance() {
        if(instance == null) {
            instance = new SingleTonOfLazy();
        }
        return instance;
    }
}
