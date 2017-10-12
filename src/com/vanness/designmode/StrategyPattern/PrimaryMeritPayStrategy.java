package com.vanness.designmode.StrategyPattern;

/**
 * C类绩效工资类
 */
public class PrimaryMeritPayStrategy implements MeritPayStrategy {
    /**
     * C类员工绩效工资按照80%发放
     * @param baseMeritPay 基础绩效工资
     * @return
     */
    @Override
    public double calcMeritPay(double baseMeritPay) {
        return baseMeritPay * 0.8;
    }
}
