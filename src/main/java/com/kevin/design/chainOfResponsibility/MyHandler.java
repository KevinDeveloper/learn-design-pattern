package com.kevin.design.chainOfResponsibility;

import java.util.Objects;

/**
 * @ClassName: MyHandler
 * @Description: 具体责任处理人
 * @Author: Kevin
 * @Date: 2018/9/20 11:30
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    /**
     * 业务处理
     */
    @Override
    public void operation() {
        System.out.println("MyHandler, operation, name=" + name);
        if (Objects.nonNull(getHandler())) {
            getHandler().operation();
        }
    }
}
