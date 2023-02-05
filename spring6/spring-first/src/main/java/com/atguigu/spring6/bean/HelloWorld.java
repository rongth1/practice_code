package com.atguigu.spring6.bean;

/**
 * @author rth
 * @description: 创建bean
 * @date 2023/2/4
 */
public class HelloWorld {

    public HelloWorld() {
        System.out.println("调用构造函数");
    }

    public void sayHello() {
        System.out.println("hello world!");
    }

}
