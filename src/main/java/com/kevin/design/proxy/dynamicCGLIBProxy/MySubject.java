package com.kevin.design.proxy.dynamicCGLIBProxy;

/**
 * @ClassName: MySubject
 * @Description: MySubject，cglib不需要定义目标类的统一接口
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
    public void operation2(String name,  String address) {
        System.out.println("MySubject execute operation2, name="+name+", address="+address);
    }
}
