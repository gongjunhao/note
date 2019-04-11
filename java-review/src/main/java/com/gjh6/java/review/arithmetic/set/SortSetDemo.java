package com.gjh6.java.review.arithmetic.set;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-11
 * Time: 9:07 PM
 */
public class SortSetDemo {
    public static void main(String[] args) {
        String str = "中华人民共和国";
        Set<String> strings = sortSet(str);
        strings.stream().forEach((s) -> System.out.println(s));
    }

    private static Set<String> sortSet(String str) {
        Set<String> sets = new CopyOnWriteArraySet<>();
        char[] chars = str.toCharArray();
        for(int i=0; i< chars.length-1; i++) {
            for(int j=i+1; j< chars.length; j++) {
                sets.add(chars[i]+""+chars[j]);
                sets.add(chars[j]+""+chars[i]);
            }
        }
        return sets;
    }
}
