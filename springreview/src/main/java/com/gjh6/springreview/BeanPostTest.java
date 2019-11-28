package com.gjh6.springreview;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Gong.Junhao
 * @version V1.0
 * @program: note
 * @Description: TODO
 * @Package com.gjh6.springreview
 * @date 2019/11/27 09:59
 */
public class BeanPostTest implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean post before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean post after");
        return null;
    }
}
