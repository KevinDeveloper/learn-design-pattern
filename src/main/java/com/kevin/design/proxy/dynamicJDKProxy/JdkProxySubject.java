package com.kevin.design.proxy.dynamicJDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: JdkProxySubject
 * @Description: jdk 动态代理是基于接口的， 　JDK动态代理只能对实现了接口的类生成代理，而不能针对类
 *  InvocationHandler 接口的子类可以看成代理的最终操作类
 * @Author: Kevin
 * @Date: 2018/9/26 16:39
 */
public class JdkProxySubject implements InvocationHandler {

    private Subject subject;

    public JdkProxySubject(Subject mySubject) {
        this.subject = mySubject;
    }


    /**
     * invoke方法方法参数解析
     * @param proxy 指被代理的对象
     * @param method 要调用的方法
     * @param args 方法调用时所需要的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before - JdkProxySubject");
        Object result = null;
        try{
            //利用反射动态的来反射方法，这就是动态代理和静态代理的区别
            result = method.invoke(subject,args);
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally {
            System.out.println("after - JdkProxySubject");
        }
        return result;
    }
}
