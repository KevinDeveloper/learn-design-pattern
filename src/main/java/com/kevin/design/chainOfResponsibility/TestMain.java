package com.kevin.design.chainOfResponsibility;

/**
 * @ClassName: TestMain
 * @Description: 责任链模式 - 测试类
 * @Author: Kevin
 * @Date: 2018/9/20 13:05
 */
public class TestMain {

    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");
        MyHandler h4 = new MyHandler("h4");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h3.setHandler(h4);
        h1.operation();
    }

}
