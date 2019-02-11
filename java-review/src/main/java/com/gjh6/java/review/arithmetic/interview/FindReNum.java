package com.gjh6.java.review.arithmetic.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: 找出重复的数字
 * User: gjh
 * Date: 2019-02-06
 * Time: 3:02 PM
 */
public class FindReNum {
    public static void main(String[] args) {
        int[] array = {0,1,4,3,2,1,3};
        Map<Integer, Integer> repeatNum = findReapetNum(array);
    }

    private static Map<Integer, Integer> findReapetNum(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        if(array == null || array.length == 0) {
            return null;
        }
        int key = 0, count = 0;

        return null;
    }
}
