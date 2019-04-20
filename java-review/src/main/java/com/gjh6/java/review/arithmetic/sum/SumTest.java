package com.gjh6.java.review.arithmetic.sum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: gjh
 * Date: 2019-04-15
 * Time: 1:44 PM
 */
public class SumTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i< 3; i++) {
            if(i==0){
                sum = 1;
            } else {
                sum += 2<<i;
            }
            System.out.println(2<<i);
        }
        System.out.println(sum);

        System.out.println(getG(1024));

        System.out.println(Math.sqrt(1024));
    }

    public static int getG(int number) {
        return number >> 3;
    }
}
