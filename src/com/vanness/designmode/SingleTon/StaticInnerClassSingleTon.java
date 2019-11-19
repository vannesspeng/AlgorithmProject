package com.vanness.designmode.SingleTon;

public class StaticInnerClassSingleTon {

    private StaticInnerClassSingleTon() {
    }

    public static StaticInnerClassSingleTon getSingleton() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder {
        private final static StaticInnerClassSingleTon SINGLETON = new StaticInnerClassSingleTon();
    }
}


