package com.gjh6.java.review.designpattern.proxy;

/**
 *
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-12-06
 * Time: 3:43 PM
 */
public class Singer implements ISinger {

    @Override
    public void victory() {
        System.out.println("开演唱会！");
    }
}
