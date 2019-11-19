package com.vanness.designmode.FactoryMode.factory;

public class RecTangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
