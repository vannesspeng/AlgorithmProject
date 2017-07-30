package com.vanness.designmode.SingleTon;

public class Test {
    public static void main(String[] args) {
        SingleTonOfHunger s1 = SingleTonOfHunger.getInstance();
        SingleTonOfHunger s2 = SingleTonOfHunger.getInstance();
        SingleTonOfLazy s3 = SingleTonOfLazy.getInstance();
        SingleTonOfLazy s4 = SingleTonOfLazy.getInstance();
        DoubleCheckSingleTon s5 = DoubleCheckSingleTon.getInstance();
        DoubleCheckSingleTon s6 = DoubleCheckSingleTon.getInstance();

        //饿汉模式
        if(s1 == s2) {
            System.out.println("s1和s2是同一个对象");
        }else {
            System.out.println("s1和s2不是同一个对象");
        }

        //懒汉模式
        if(s3 == s4) {
            System.out.println("s3和s4是同一个对象");
        }else {
            System.out.println("s3和s4不是同一个对象");
        }

        //DCL双重检查锁机制的单例模式
        if(s5 == s6) {
            System.out.println("s5和s6是同一个对象");
        }else {
            System.out.println("s5和s6不是同一个对象");
        }
    }
}
