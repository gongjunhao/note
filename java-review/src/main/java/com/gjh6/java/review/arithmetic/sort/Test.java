package com.gjh6.java.review.arithmetic.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-02-14
 * Time: 3:43 PM
 */
public class Test {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for(int i=0; i<10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        //bubbleSort(arr);
        //quickSort(arr, 0, 9);
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序
     * @return
     */
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        if(arr!= null && arr.length > 1) {
            int len = arr.length;
            for(int i=0; i<len-1; i++) {
                for (int j=i; j<len; j++) {
                    if(arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

//    /**
//     * 快速排序
//     * @return
//     */
//    public static int[] quickSort1(int[] arr, int start, int end) {
//        int baseNum = arr[start];
//        int position = start;
//        if(arr!= null && arr.length > 1) {
//            for(int i=end; i> start+1; i--) {
//                if(baseNum > arr[i]) {
//                    arr[position] = arr[i];
//                    arr[i] = baseNum;
//                    position = i;
//                }
//            }
//            if(position+1 < end) {
//                quickSort1(arr, start, position-1);
//                quickSort1(arr, position+1, end);
//            }
//            return arr;
//        } else {
//            return arr;
//        }
//    }

    /**
     * 快速排序
     * @param src
     * @param begin
     * @param end
     */
    private static void quickSort(int[] src, int begin, int end) {
        if (begin < end) {
            int key = src[begin];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && src[j] > key) {
                    j--;
                }
                if (i < j) {
                    src[i] = src[j];
                    i++;
                }
                while (i < j && src[i] < key) {
                    i++;
                }
                if (i < j) {
                    src[j] = src[i];
                    j--;
                }
            }
            src[i] = key;
            quickSort(src, begin, i - 1);
            quickSort(src, i + 1, end);
        }
    }


    /**
     * 选择排序
     * @param arr
     */
    private static void selectSort(int[] arr) {
        int length = arr.length;
        for(int i=0; i<length; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j<length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(i < minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
