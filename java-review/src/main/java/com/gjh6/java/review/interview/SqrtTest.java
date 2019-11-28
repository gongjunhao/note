package com.gjh6.java.review.interview;

public class SqrtTest {
    public static void main(String[] args) {
        for(int i=0; i<1000; i++) {
            if(checkSqrtNum(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkSqrtNum(int num) {
        if(num == 0 || num == 1 || num == 4|| num == 9){
            return true;
        }
        for(int i=num>>2; i>0; i--) {
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}
