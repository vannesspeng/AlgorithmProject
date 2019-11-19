package com.vanness.designmode.FactoryMode.factory;

public class SquareFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
