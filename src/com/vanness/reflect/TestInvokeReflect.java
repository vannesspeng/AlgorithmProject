package com.vanness.reflect;

import java.lang.reflect.Method;

/**
 * 反射机制是一种程序自我分析的能力。用于获取一个类的类变量，构造函数，方法，修饰符。但是它的优劣势如下：
 * <p>
 * 优点：运行期类型的判断，动态类加载，动态代理使用反射。
 * <p>
 * 缺点：性能是一个问题，反射相当于一系列解释操作，通知jvm要做的事情，性能比直接的java代码要慢很多。
 */

public class TestInvokeReflect {
    public static double calculate(int a, double b) {
        return a + b;
    }

    public static String printInfo(String info) {
        return "info: " + info;
    }

    public static void main(String[] args) throws Exception {
        Class<?> classType = TestInvokeReflect.class;
        //获取classType对象
        //newInstance: 弱类型。低效率。只能调用无参构造。
        //new: 强类型。相对高效。能调用任何public构造。
        Object invoke = classType.newInstance();

        //获取calculate方法
        Method calculate = classType.getMethod("calculate", int.class, double.class);
        Object result = calculate.invoke(invoke, 3, 1.4);
        System.out.println("最终的计算结果：" + result);

        //获取printInfo方法
        Method printInfo = classType.getMethod("printInfo", String.class);
        Object printNameInfo = printInfo.invoke(invoke, "彭亚运");
        System.out.println(printNameInfo);
    }
}
