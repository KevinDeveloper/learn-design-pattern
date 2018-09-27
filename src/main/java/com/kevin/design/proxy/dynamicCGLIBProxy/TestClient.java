package com.kevin.design.proxy.dynamicCGLIBProxy;

/**
 * @ClassName: TestClient
 * @Description: 客户端没讲
 * @Author: Kevin
 * @Date: 2018/9/26 16:48
 */
public class TestClient {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        // 此刻，mySubject不是原先的实现类，而是增强过的目标类
        Subject mySubject = (MySubject) cglibProxy.getProxy(MySubject.class);
        // 在代理对象上调用方法
        mySubject.operation1();
        mySubject.operation2("Kevin", "opzoon");

    }
}
