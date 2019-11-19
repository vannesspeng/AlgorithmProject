package com.vanness.designmode.FactoryMode.factory;

public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
