package com.kevin.design.proxy.staticProxy;

/**
 * @ClassName: TestClient
 * @Description: 测试类， 客户端调用
 * @Author: Kevin
 * @Date: 2018/9/26 16:32
 */
public class TestClient {
    public static void main(String[] args) {
        Subject subject = new MyProxy(new MySubject());
        subject.operation();
    }

}
