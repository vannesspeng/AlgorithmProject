package com.vanness.designmode.StrategyPattern;

/**
 * A类绩效工资类
 */
public class AdvancedMeriPayStrategy implements MeritPayStrategy {
    /**
     * A类员工绩效按照120%发放
     *
     * @param baseMeritPay 基础绩效工资
     * @return
     */
    @Override
    public double calcMeritPay(double baseMeritPay) {
        return baseMeritPay * 1.2;
    }
}
