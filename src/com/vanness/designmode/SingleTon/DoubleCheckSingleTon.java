package com.vanness.designmode.SingleTon;

/**
 * 线程安全的单例模式：使用了DCL双检查锁机制
 * 实现线程安全的单例模式还有以下方式：
 * 1、使用静态内部类实现单例模式
 *
 * 2、序列化与反序列化模式的单例实现
 * 序列化对象的hashCode和反序列化后得到的对象的hashCode值不一样，反序列化后返回的对象是重新实例化的，单例被破坏了
 * 解决方案如下：
 * //该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MySingletonHandler.instance;
    }

 * 3、使用静态代码块的方式
 * 4、使用枚举数据类型实现单例模式:枚举类的构造方法在类加载是被实例化
 */
public class DoubleCheckSingleTon {
    private static DoubleCheckSingleTon instance;

    private DoubleCheckSingleTon(){}

    /**
     * 为什么不直接在getInstance方法上使用Synchronized同步，同步方法，粒度过大，影响性能。
     * @return
     */
    public static DoubleCheckSingleTon getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckSingleTon.class) {  //降低同步的粒度，但此时却不发保证线程安全了，需使用双检查锁机制
                if(instance == null) { //
                    instance = new DoubleCheckSingleTon();
                }

            }

        }
        return instance;
    }
}
