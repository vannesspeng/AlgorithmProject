package com.vanness.designmode.StrategyPattern;

/**
 * B类绩效工资类
 */
public class IntermediateMeriPayStrategy implements MeritPayStrategy{
    /**
     * B类员工绩效工资按照100%发放
     * @param baseMeritPay 基础绩效工资
     * @return
     */
    @Override
    public double calcMeritPay(double baseMeritPay) {
        return baseMeritPay;
    }
}
