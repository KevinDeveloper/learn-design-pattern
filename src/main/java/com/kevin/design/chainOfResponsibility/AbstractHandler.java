package com.kevin.design.chainOfResponsibility;

/**
 * @ClassName: AbstractHandler
 * @Description: 抽象责任者，包装真正处理的责任人
 * @Author: Kevin
 * @Date: 2018/9/20 11:29
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
