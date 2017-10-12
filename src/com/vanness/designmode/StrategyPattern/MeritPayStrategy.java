package com.vanness.designmode.StrategyPattern;

/**
 * 计算绩效工资的接口
 */
public interface MeritPayStrategy {
    /**
     * 计算最终的绩效工资
     * @param baseMeritPay 基础绩效工资
     * @return 最终绩效工资
     */
    double calcMeritPay(double baseMeritPay);
}
