package com.atguigu.spring6.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rth
 * @description:
 * @date 2023/2/4
 */
public class HelloWorldTest {

    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    /**
     * 1. 底层是怎么创建对象的，是通过反射机制调用无参数构造方法吗？
     *      创建对象时确实调用了无参数构造方法
     * 2. Spring是如何创建对象的呢？原理是什么？
     *      dom4j解析beans.xml文件，从中获取class属性值，类的全类名
     *      通过反射机制调用无参数构造方法创建对象
     * 3. 把创建好的对象存储到一个什么样的数据结构当中了呢？
     *      Spring容器加载到Bean类时 , 会把这个类的描述信息, 以包名加类名的方式存到beanDefinitionMap 中,
     *      Map<String,BeanDefinition> , 其中 String是Key , 默认是类名首字母小写 , BeanDefinition ,
     *      存的是类的定义(描述信息) , 我们通常叫BeanDefinition接口为 : bean的定义对象
     */
    @Test
    public void testHelloWorld() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();
        logger.info("成功！");
    }

}
