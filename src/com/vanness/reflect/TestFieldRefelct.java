package com.vanness.reflect;

import java.lang.reflect.Field;

public class TestFieldRefelct {
    public static void main(String[] args) throws Exception {
        //首先，获取Boolean的Class对象
        Class classType = Class.forName("java.lang.Boolean");

        //获取Boolean类中声明所有成员变量的Field对象的数组
        Field[] fields = classType.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("********************************************");

        //获取Boolean类中声明的所有public成员变量Filed对象的数组
        Field[] fields1 = classType.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }


    }
}
