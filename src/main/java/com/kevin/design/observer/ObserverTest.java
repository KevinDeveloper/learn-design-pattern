package com.kevin.design.observer;

/**
 * @ClassName: ObserverTest
 * @Description: 观察者模式 - 测试类
 * @Author: Kevin
 * @Date: 2018/9/20 10:03
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.addObserver(new Observer1Impl());
        subject.addObserver(new Observer2Impl());
        subject.operation();
        System.out.println("======================");
        Observer extraObserver = new Observer2Impl();
        subject.addObserver(extraObserver);
        subject.operation();
        System.out.println("======================");
        subject.delObserver(extraObserver);
        subject.operation();

    }

}
