package com.gjh6.java.review.base.string;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-09-11
 * Time: 下午2:12
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "123";
        String s1 = "123";
        String s2 = s.substring(0, 1);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(System.identityHashCode(s));

        HashSet<String> set = new HashSet<String>();
        set.add(new String("a"));
        set.add(new String("a"));
        set.add(new String("c"));

        for(String a: set) {
            System.out.println(a);
        }


        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memoryMXBean.getHeapMemoryUsage();
        System.out.println("INT HEAP:" + usage.getInit()/1024/1024 + "Mb");
        System.out.println("MAX HEAP:" + usage.getMax()/1024/1024 + "Mb");
        System.out.println("USED HEAP:" + usage.getUsed()/1024/1024 + "Mb");

        System.out.println("\nFull Information:");
        System.out.println("Heap Memory Usage:" + memoryMXBean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage:" + memoryMXBean.getNonHeapMemoryUsage());

        List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        System.out.println("=====================java options==================");
        System.out.println(inputArguments);

        System.out.println("=====================通过java来获取相关系统状态====================");
        long i = Runtime.getRuntime().totalMemory()/1024/1024;//Java 虚拟机中的内存总量，以字节为单位
        System.out.println("总的内存量为:" + i + "Mb");
        long j = Runtime.getRuntime().freeMemory()/1024/1024;//Java 虚拟机中的空闲内存量
        System.out.println("空闲内存量:" + j + "Mb");
        long k = Runtime.getRuntime().maxMemory()/1024/1024;
        System.out.println("最大可用内存量:" + k + "Mb");

    }
}
