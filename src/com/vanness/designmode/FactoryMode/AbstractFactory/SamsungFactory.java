package com.vanness.designmode.FactoryMode.AbstractFactory;

public class
SamsungFactory implements IFactory {
    @Override
    public ProductIcebox produceIcebox() {
        return new SamsungIcebox();
    }

    @Override
    public ProductWashMachine produceWashMachine() {
        return new SamsungWashMachine();
    }
}
