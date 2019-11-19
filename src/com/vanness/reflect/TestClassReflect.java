package com.vanness.reflect;

import java.util.HashSet;
import java.util.Set;

/**
 * Java运行时的环境中，动态获取类的信息以及动态调用对象的方法的功能叫反射机制（Reflection）
 */
public class TestClassReflect {

    //三种方式获取Class对象

    public static void getClassForName() throws ClassNotFoundException {
        Class<?> classType = Class.forName("java.lang.Boolean");
        //输出class java.lang.Boolean
        System.out.println(classType);
    }

    public static void getClassClass() {
        Class<?> classType = Boolean.class;
        //输出class java.lang.Boolean
        System.out.println(classType);
    }

    public static void getClassOrdinal() {
        Set map = new HashSet();
        Class<?> classType = map.getClass();
        //输出class java.util.HashSet
        System.out.println(classType);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        TestClassReflect.getClassForName();
        TestClassReflect.getClassClass();
        TestClassReflect.getClassOrdinal();
    }
}
