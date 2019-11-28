package com.gjh6.java.review.springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Gong.Junhao
 * @version V1.0
 * @program: note
 * @Description: TODO
 * @Package com.gjh6.java.review.springboot
 * @date 2019/11/27 09:42
 */
//@Component
public class BeanPostTest implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean Post Process Before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("Bean Post Process After");
        return null;
    }
}
