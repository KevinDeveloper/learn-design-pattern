package com.kevin.design.observer;

/**
 * @ClassName: Observer1Impl
 * @Description: 观察者1
 * @Author: Kevin
 * @Date: 2018/9/20 09:50
 */
public class Observer1Impl implements Observer{

    /**
     * 通知更新观察者
     */
    @Override
    public void update() {
        System.out.println("observer1 has reservied ! ");
    }
}
