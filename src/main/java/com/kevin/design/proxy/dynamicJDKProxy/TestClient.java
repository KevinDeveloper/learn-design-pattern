package com.kevin.design.proxy.dynamicJDKProxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName: TestClient
 * @Description: 测试类， 客户端调用
 * JDK动态代理只能对实现了接口的类生成代理，而不能针对类
 * @Author: Kevin
 * @Date: 2018/9/26 16:44
 */
public class TestClient {

    public static void main(String[] args) {
        /**
         * newProxyInstance方法参数解析
         * ClassLoader loader：类加载器
         * Class<?>[] interfaces：得到全部的接口
         * InvocationHandler h：得到InvocationHandler接口的子类实例
         */
        Subject subject = (Subject) Proxy.newProxyInstance(TestClient.class.getClassLoader(), new Class[]{Subject.class}, new JdkProxySubject(new MySubject()));
        subject.operation1();
        subject.operation2();
    }
}
