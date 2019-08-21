package com.vanness.designmode.DecoratorPattern;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.11;
    }
}
