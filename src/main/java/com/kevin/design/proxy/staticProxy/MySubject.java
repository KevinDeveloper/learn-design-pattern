package com.kevin.design.proxy.staticProxy;

/**
 * @ClassName: MySubject
 * @Description: 真正实现接口
 * @Author: Kevin
 * @Date: 2018/9/26 16:29
 */
public class MySubject implements Subject {
    /**
     * 业务处理
     */
    @Override
    public void operation() {
        System.out.println("MySubject subject execute operation");
    }
}
