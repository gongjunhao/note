package com.gjh6.java.review.base;

import java.io.*;

/**
 * 实现Externalizable接口，重写writeExternal 和 readExternal方法
 * 跟transient关系不大，及时被修饰了也能被序列化
 */
public class ExternalizableTest implements Externalizable {

    private transient String username = "xxxxx";
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(username);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        username = (String) in.readObject();
    }

    public static void main(String[] args) {
        ExternalizableTest externalizableTest = new ExternalizableTest();
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("d:/2.class"));
            outputStream.writeObject(externalizableTest);
            outputStream.close();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:/2.class"));
            ExternalizableTest test = (ExternalizableTest)objectInputStream.readObject();
            System.out.println(test.username);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
