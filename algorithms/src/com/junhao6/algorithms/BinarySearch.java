package com.junhao6.algorithms;

import java.util.Arrays;

/**
 * 二分法查找
 *  1.排序
 *  2.取中对比
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2018-11-06
 * Time: 上午11:23
 */
public class BinarySearch {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{32,42,12,54,432};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int index = binarySearch(432, array);
        System.out.println(index);

        int i = Arrays.binarySearch(array, 54);
        System.out.println(i);
    }

    /**
     * 二分法查找
     * @param key
     * @param array
     * @return
     */
    public static int binarySearch(int key, Integer[] array) {
        int index = -1;
        if(array.length > 0) {
            int lo = 0;
            int hi = array.length - 1;
            while(hi >= lo) {
                //被查找的键要么不存在，要么必然存在于array[lo..hi]之中
                int mod = lo + (hi - lo) /2;
                if(key > array[mod]){
                    lo = mod+1;
                } else if(key < array[mod]) {
                    hi = mod-1;
                } else {
                    return mod;
                }
            }
        }
        return index;
    }
}
