package org.apache.markt;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("org.apache.markt.Target", false, Test.class.getClassLoader());
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
