package com.vanness.designmode.StrategyPattern;

public class MeriPay {

    /**
     *
     */
    private MeritPayStrategy meritPayStrategy;

    public MeriPay(MeritPayStrategy meritPayStrategy) {
        this.meritPayStrategy = meritPayStrategy;
    }

    public void setMeritPayStrategy(MeritPayStrategy meritPayStrategy) {
        this.meritPayStrategy = meritPayStrategy;
    }

    public double calMeritPay(int baseMeritPay) {
        return meritPayStrategy.calcMeritPay(baseMeritPay);
    }
}
