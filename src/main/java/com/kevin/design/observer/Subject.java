package com.kevin.design.observer;

/**
 * @ClassName: Subject
 * @Description: 主对象
 * @Author: Kevin
 * @Date: 2018/9/20 09:54
 */
public interface Subject {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void delObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();

    /**
     * 业务处理
     */
    void operation();

}
