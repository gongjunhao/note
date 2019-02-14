package com.gjh6.java.review.base.io;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-13
 * Time: 11:17 AM
 */
public class Test {
    public static void main(String[] args) {
        String str = "git clone http://123.56.183.194:8088/dbpf/dbpf-service.git";
        String target = "."+str.substring(str.indexOf("88/")+2, str.lastIndexOf("."));
        System.out.println(target);
    }
}