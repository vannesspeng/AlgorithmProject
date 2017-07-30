package com.vanness.designmode.SingleTon;

public class DoubleCheckSingleTon {
    private static DoubleCheckSingleTon instance;

    private DoubleCheckSingleTon(){}

    public static DoubleCheckSingleTon getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckSingleTon.class) {
                if(instance == null) {
                    instance = new DoubleCheckSingleTon();
                }

            }

        }
        return instance;
    }
}
