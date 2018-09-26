package com.kevin.design.proxy.dynamicCGLIBProxy;

/**
 * @ClassName: TestClient
 * @Description:
 *
 * CGLib动态代理创建代理实例速度慢，但是运行速度快；
 * JDK动态代理创建实例速度快，但是运行速度慢。如果实例是单例的，推荐使用CGLib方式动态代理，反之则使用JDK方式进行动态代理。
 *
 *
 * 使用CGLib实现动态代理，CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，比使用Java反射效率要高。
 * 唯一需要注意的是，cglib生成代理是通过字节码生成的子类作为代理类，CGLib不能对声明为final的方法进行代理，因为CGLib原理是动态生成被代理类的子类。
 *
 *
 *Spring的实例默认是单例，所以这时候使用CGLib性能高。
 *
 * Spring在选择用JDK还是CGLiB的依据：
 * (1)当Bean实现接口时，Spring就会用JDK的动态代理
 * (2)当Bean没有实现接口时，Spring使用CGlib是实现
 * (3)可以强制使用CGlib（在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>）

Spring两种代理方式

若目标对象实现了接口，spring默认使用JDK的动态代理。
优点：因为有接口，所以使系统更加松耦合
缺点：为每一个目标类创建接口

若目标对象没有实现任何接口，spring使用CGLIB进行动态代理。
优点：因为代理类与目标类是继承关系，所以不需要有接口的存在。
缺点：因为没有使用接口，所以系统的耦合性没有使用JDK的动态代理好。

若目标对象实现了接口，但是强制cglib代理，则使用cglib代理

 * @Author: Kevin
 * @Date: 2018/9/26 16:48
 */
public class TestClient {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // 此刻，mySubject，而是增强过的目标类
        MySubject mySubject = (MySubject) proxy.getProxy(MySubject.class);
        mySubject.operation1();
        mySubject.operation2("Kevin", "opzoon");

    }
}
