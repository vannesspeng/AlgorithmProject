package com.vanness.designmode.FactoryMode.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        IFactory ssFactory = new SamsungFactory();
        IFactory haierFactory = new HaierFactory();

        ssFactory.produceIcebox();
        ssFactory.produceWashMachine();
        haierFactory.produceIcebox();
        haierFactory.produceWashMachine();
    }
}
