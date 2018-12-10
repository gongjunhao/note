package com.gjh6.java.review.designpattern.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-12-06
 * Time: 3:46 PM
 */
public class SingerStaticProxy {

    private Singer singer;


    public SingerStaticProxy(Singer singer) {
        this.singer = singer;
    }

    public void victory() {
        System.out.println("准备工作！");
        singer.victory();
        System.out.println("结束！");
    }
}
