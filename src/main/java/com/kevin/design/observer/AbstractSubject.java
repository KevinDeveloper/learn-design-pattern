package com.kevin.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractSubject
 * @Description: 定义抽象的主体类，定好固定逻辑
 * @Author: Kevin
 * @Date: 2018/9/20 09:57
 */
public abstract class AbstractSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());

    }


}
