package com.kevin.design.observer;

/**
 * @ClassName: Observer2Impl
 * @Description: 观察者2
 * @Author: Kevin
 * @Date: 2018/9/20 09:53
 */
public class Observer2Impl implements Observer {
    /**
     * 通知更新观察者
     */
    @Override
    public void update() {
        System.out.println("observer2 has reservied ! ");
    }
}
