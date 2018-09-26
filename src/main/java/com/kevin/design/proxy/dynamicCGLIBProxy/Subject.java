package com.kevin.design.proxy.dynamicCGLIBProxy;

/**
 * @ClassName: Subject
 * @Description: subject 抽象接口
 * @Author: Kevin
 * @Date: 2018/9/26 16:28
 */
public interface Subject {
    /**
     * 业务处理1
     */
    void operation1();
    /**
     * 业务处理2
     */
    void operation2(String name, String address);
}
