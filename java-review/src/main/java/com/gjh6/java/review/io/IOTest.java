package com.gjh6.java.review.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created with IntelliJ IDEA.
 * Description: 传统IO 示例
 *              读写阻塞
 *              Selector 需要配合socketChannel测试
 * User: gjh
 * Date: 2019-04-17
 * Time: 8:28 AM
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        //bioTest();
        //read();
        nioTest();
    }

    /**
     * 基于Buffer Channel Selector实现的NIO
     */
    private static void nioTest() throws IOException {
        File file = new File("/etc/passwd");
        FileInputStream fis = new FileInputStream(file);
        FileChannel channel = fis.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        int read = 0;
        do {
            byteBuffer.clear();
            read = channel.read(byteBuffer);
            byteBuffer.flip();
            if(read > 0) {
                for (int i = 0; i < byteBuffer.limit(); i++) {
                    System.out.print((char) byteBuffer.get());
                }
            }
        } while (read > 0);


    }

    /**
     *  阻塞IO 一个字节一个字节的读取，不能移动，且多线程环境下阻塞 效率低
     */
    private static void bioTest() throws IOException {
        File file = new File("/etc/passwd");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String lineContent = null;
        do {
            lineContent = bufferedReader.readLine();
            System.out.println(lineContent==null?"":lineContent);
        } while (lineContent != null);
    }

    /**
     * JDK1.7
     */
    public static void read() {
        Path path = Paths.get("/etc/passwd");
        try {
            Files.lines(path).forEach(System.out::println);//print each line
        } catch (IOException ex) {
            ex.printStackTrace();//handle exception here
        }
    }
}
