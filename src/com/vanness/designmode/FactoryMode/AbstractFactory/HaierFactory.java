package com.vanness.designmode.FactoryMode.AbstractFactory;

public class HaierFactory implements IFactory {
    @Override
    public ProductIcebox produceIcebox() {
        return new HaierIcebox();
    }

    @Override
    public ProductWashMachine produceWashMachine() {
        return new HaierWashMachine();
    }
}
