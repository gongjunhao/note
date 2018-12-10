package com.gjh6.java.review.jvm;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-12-10
 * Time: 3:12 PM
 */
public class JVMTest {

    // 每次内存分配大小
    private static int _1M =1024*1024;

    // main
    public static void main(String[] args) {
        testDirectM();
        //directMemoryOut();  //直接内存溢出
        //stackOut();         //栈溢出
        //headOut();          //堆溢出
    }

    /**
     * 堆空间溢出
     * 设置最大堆空间100M -Xmx100m
     */
    public static void headOut() {
        int i = 1;
        List<ByteBuffer> byteBuffers = new ArrayList<>();
        while (true) {
            byteBuffers.add(ByteBuffer.allocate(_1M));
            System.out.println("已分配堆内存:"+i+++"M");
        }
    }

    /**
     * -Xss160k：设置每个线程的栈大小。
     * JDK5.0以后每个线程栈大小为1M，以前每个线程栈大小为256K,
     * JDK1.8最小栈空间160k,否则无法启动jvm
     */
    public static void stackOut() {
        looop();
    }

    /**
     * 无线递归
     */
    private static void looop() {
        looop();
    }


    /**
     * 直接内存和JVM堆内存区别
     * 直接内存并非 JVMS 定义的标准 Java 运行时内存。
     * JDK1.4 加入了新的 NIO 机制，目的是防止 Java 堆 和 Native 堆之间往复的数据复制带来的性能损耗，此后 NIO 可以使用 Native 的方式直接在 Native 堆分配内存。
     * 直接内存区域是全局共享的内存区域。
     * 直接内存区域可以进行自动内存管理(GC)，但机制并不完善。
     * 本机的 Native 堆(直接内存) 不受 JVM 堆内存大小限制。
     * 可能出现 OutOfMemoryError 异常。
     * 直接内存读写性能优于jvm对内存，但是分配销毁性能弱于jvm内存
     */
    public static void testDirectM() {
        ByteBuffer allocate = ByteBuffer.allocate(1024);        //jvm堆内存分配1k空间
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);//os物理内存分配1k空间 （读写性能优于jvm对内存，但是分配销毁性能弱于jvm内存）
        //测试用例 参考 https://www.cnblogs.com/z-sm/p/6235157.html
        //分配1k空间，for循环10000次写入并读取，对比读写性能
        //for循环10000次，分配并销毁1k空间，对比分配销毁性能
    }

    /**
     * 直接堆内存溢出
     * VM Args: -XX:MaxDirectMemorySize=10M
     * Exception : java.lang.OutOfMemoryError: Direct buffer memory
     */
    public static void directMemoryOut() {
        List<ByteBuffer> byteBuffers = new ArrayList<>();
        while (true) {
            byteBuffers.add(ByteBuffer.allocateDirect(_1M));
        }
    }
}
