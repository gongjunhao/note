package com.gjh6.java.review.base;

public class FinalTest {
    public static void main(String[] args)  {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;   //用的final变量的地方，编译成字节码时，就会直接替换为 hello2, 可也查看.class 反编译文件 不过要注意，只有在编译期间能确切知道final变量值的情况下，编译器才会进行这样的优化，
        String e = d + 2;

        final  String f = getHello();
        String g = f + 2;

        System.out.println((a == c));       //true
        System.out.println((a == e));       //false
        System.out.println((a == g));       //false




        //static 和 final的 区别
        //static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);

        System.out.println(myClass2.i);
        System.out.println(myClass2.j);
    }


    public static String getHello() {
        return "hello";
    }


}

class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}