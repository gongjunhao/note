package com.gjh6.java.review.base;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-18
 * Time: 5:10 PM
 */
public class SwitchTest {
    public static void main(String[] args) throws Exception {
        int type = 5;
        switch (type) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println(4);
                break;
        }

        try {
            throw new Exception("1");
        } catch (IOException e) {
            throw new Exception("2");
        } catch (Exception e) {
            throw new Exception("3");
        } finally {
            throw new Exception("4");
        }
    }
}
