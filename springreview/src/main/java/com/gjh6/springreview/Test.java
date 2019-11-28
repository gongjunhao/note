package com.gjh6.springreview;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Test implements ApplicationContextAware, InitializingBean {
    private String username;
    private int age;
    private static Test instance = new Test();
    public Test() {
        System.out.println("无参构造函数");
    }

    public Test(String username, String age) {
        System.out.println("username="+username);
        System.out.println("age="+age);
        System.out.println("有参构造函数");
    }

    public void initMethod() {
        System.out.println("初始化方法");
    }

    public static Test createTest() {
        System.out.println("静态方法！");
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("setter 注入 username");
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter 注入 age");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
        System.out.println("获取容器");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("设置属性后");
    }
}
