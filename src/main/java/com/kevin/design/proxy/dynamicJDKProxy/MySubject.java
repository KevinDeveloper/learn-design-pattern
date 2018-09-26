package com.kevin.design.proxy.dynamicJDKProxy;

/**
 * @ClassName: MySubject
 * @Description:
 * @Author: Kevin
 * @Date: 2018/9/26 16:38
 */
public class MySubject implements Subject {
    /**
     * 业务处理1
     */
    @Override
    public void operation1() {
        System.out.println("MySubject execute operation1");
    }

    /**
     * 业务处理2
     */
    @Override
    public void operation2() {
        System.out.println("MySubject execute operation2");
    }
}
