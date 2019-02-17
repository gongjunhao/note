package com.gjh6.java.review.designpattern.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-17
 * Time: 12:03 PM
 */
public class CglibTest implements MethodInterceptor {

    private Object targetObj;

    public CglibTest(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Object createObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object object = methodProxy.invoke(this.targetObj, objects);//这里如果换成obj 会陷入死循环中
        System.out.println("end");
        return object;

    }
}
