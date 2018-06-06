package com.gjh6.java.review.base;

import java.io.*;

/**
 * transient 关键词
 * 禁止修饰的属性被序列化
 */
public class TransientTest implements Serializable {
    private String username;
    private int age;
    private transient String password;

    public TransientTest() {
    }

    public TransientTest(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public static void main(String[] args) {
        TransientTest test = new TransientTest("张三", 23, "12345435");
        try (OutputStream ops = new FileOutputStream("d:/1.class")) {
            ObjectOutputStream outputStream = new ObjectOutputStream(ops);
            outputStream.writeObject(test);
            outputStream.close();
            ops.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:/1.class"));
            TransientTest test1 = (TransientTest)objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(test1.username +"\t\t"+ test1.age +"\t\t"+ test1.password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
