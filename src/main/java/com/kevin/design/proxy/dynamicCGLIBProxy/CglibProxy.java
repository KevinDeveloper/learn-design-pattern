package com.kevin.design.proxy.dynamicCGLIBProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName: CglibProxy
 * @Description: 代理对象
 * @Author: Kevin
 * @Date: 2018/9/26 16:51
 */
public class CglibProxy implements MethodInterceptor {


    public Object getProxy(Class clazz) {
        // 定义增强器
        Enhancer enhancer = new Enhancer();
        // 定义要代理的对象
        enhancer.setSuperclass(clazz);
        // 定义回调函数
        enhancer.setCallback(this);
        // 返回生成代理对象
        return enhancer.create();
    }

    /**
     * 代理回调方法
     * @param obj 被代理的目标对象
     * @param method 目标类中被拦截的方法
     * @param args 调用拦截方法所需的参数
     * @param proxy 指的是用来调用目标类被拦截方法的方法，这个方法比反射更快
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CglibProxy 前置增强");
        System.out.println("CglibProxy, intercept, args[]="+ Arrays.toString(args));
        Object res = proxy.invokeSuper(obj, args);
        System.out.println("CglibProxy 后置增强");
        return res;
    }
}
