package com.gjh6.springreview;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //classPathXmlApplicationContext.refresh();
        Test test = classPathXmlApplicationContext.getBean("test", Test.class);
        System.out.println(test);
        System.out.println(test.toString());
    }
}
