package com.vanness.designmode.SingleTon;

import java.io.Serializable;

/**
 * 单例模式（饿汉模式）：在声明静态变量的时候，就初始化类实例（线程安全）
 * 1、私有化构造函数
 * 2、创建一个静态的类实例变量
 * 3、对外提供一个getInstance方法，返回2中的静态实例变量
 */
public class SingleTonOfHunger implements Serializable{

    private static SingleTonOfHunger singleTonOfHungerInstance = new SingleTonOfHunger();

    private SingleTonOfHunger () {}

    public static SingleTonOfHunger getInstance() {
        return singleTonOfHungerInstance;
    }
}
