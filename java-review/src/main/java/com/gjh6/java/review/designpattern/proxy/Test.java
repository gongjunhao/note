package com.gjh6.java.review.designpattern.proxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-12-06
 * Time: 4:04 PM
 */
public class Test {
    public static void main(String[] args) {

        //静态代理 （程序运行前，代理类的.class文件就已经存在了）
        Singer singer = new Singer();
        SingerStaticProxy proxy =  new SingerStaticProxy(singer);
        proxy.victory();

        //jdk动态代理
        //与静态代理类对照的是动态代理类，动态代理类的字节码在程序运行时由Java反射机制动态生成，无需程序员手工编写它的源代码。动态代理类不仅简化了编程工作，
        //而且提高了软件系统的可扩展性，因为Java 反射机制可以生成任意类型的动态代理类。java.lang.reflect
        //包中的Proxy类和InvocationHandler 接口提供了生成动态代理类的能力。
        SingerJdkProxy singerJdkProxy = new SingerJdkProxy();
        ISinger proxy1 = (ISinger) singerJdkProxy.bind(singer);
        for(int i=0; i<10000; i++) {
            ISinger proxyn = (ISinger) singerJdkProxy.bind(singer);
        }
        proxy1.victory();

    }
}
