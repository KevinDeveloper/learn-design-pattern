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

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CglibProxy 前置增强");
        System.out.println("CglibProxy, intercept, args[]="+ Arrays.toString(args));
        Object res = proxy.invokeSuper(obj, args);
        System.out.println("CglibProxy 后置增强");
        return res;
    }
}
