package com.vanness.designmode.StrategyPattern;

public class test {
    public static void main(String[] args) {
        MeriPay meriPay = new MeriPay(new AdvancedMeriPayStrategy());
        System.out.println(meriPay.calMeritPay(800));
        meriPay.setMeritPayStrategy(new PrimaryMeritPayStrategy());
        System.out.println(meriPay.calMeritPay(800));

        char[] test = {'a','b'};
        System.out.println(test);
    }
}
