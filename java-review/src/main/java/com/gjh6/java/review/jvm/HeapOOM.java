package com.gjh6.java.review.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-01-26
 * Time: 8:32 PM
 */
public class HeapOOM {

    static class HeapOOMObject {

    }

    public static void main(String[] args) {
        List<HeapOOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new HeapOOMObject());
        }
    }
}
