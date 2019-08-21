package com.vanness.designmode.DecoratorPattern;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "价格： " + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + "价格： " + beverage.cost());

        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + "价格： " + beverage.cost());

        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "价格： " + beverage.cost());


    }


}
