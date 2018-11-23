package com.gjh6.java.review.base;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-11-13
 * Time: 下午2:24
 */
public class NumberTest {
    private static final int _1MB= 1024 * 1024;
    //-XX:+PrintGC 输出GC日志
    //
    //-XX:+PrintGCDetails 输出GC的详细日志
    //
    //-XX:+PrintGCTimeStamps 输出GC的时间戳（以基准时间的形式）
    //
    //-XX:+PrintGCDateStamps 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
    //
    //-XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
    //
    //-Xloggc:../logs/gc.log 日志文件的输出路径

    //-Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+PrintGCDetails -Xloggc:./gc.log
    public static void main(String[] args) {
        byte[] a1, a2, a3, a4;
        a1 = new byte[1 * _1MB];
        a2 = new byte[1 * _1MB];
        a3 = new byte[1 * _1MB];
        a4 = new byte[1 * _1MB];
        say(a1);
        say(a2);
        say(a3);
        say(a4);
        System.out.println(say(a2));
    }

    public static byte[] say(byte[] a) {
        System.out.println(a.length);
        return a;
    }
}