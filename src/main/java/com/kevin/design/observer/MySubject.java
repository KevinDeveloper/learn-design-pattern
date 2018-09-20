package com.kevin.design.observer;

/**
 * @ClassName: MySubject
 * @Description: 业务主体类，继续抽象主体类，实现业务处理方法
 * @Author: Kevin
 * @Date: 2018/9/20 10:01
 */
public class MySubject extends AbstractSubject {
    /**
     * 业务处理
     */
    @Override
    public void operation() {
        System.out.println("MySubject operation , update observers");
        notifyObservers();

    }
}
