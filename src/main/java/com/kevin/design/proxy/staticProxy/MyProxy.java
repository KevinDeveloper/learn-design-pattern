package com.kevin.design.proxy.staticProxy;

/**
 * @ClassName: MyProxy
 * @Description:  代理接口
 * @Author: Kevin
 * @Date: 2018/9/26 16:30
 */
public class MyProxy implements Subject {

    private MySubject mySubject;

    public MyProxy(MySubject mySubject) {
        this.mySubject = mySubject;
    }

    /**
     * 业务处理
     */
    @Override
    public void operation() {
        System.out.println("before - MyProxy");
        try {
            mySubject.operation();
        } catch (Exception e) {
            System.out.println("ex:" + e.getMessage());
            throw e;
        } finally {
            System.out.println("after - MyProxy");
        }
    }
}
