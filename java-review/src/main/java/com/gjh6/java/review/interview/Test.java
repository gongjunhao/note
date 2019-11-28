package com.gjh6.java.review.interview;

public class Test {
    public static void main(String[] args) {
        String s = countAndSay(3);
        System.out.println(s);
    }

    public static String countAndSay(int n) {
        String init = "1";
        for(int i=0; i<n; i++){
            char[] chars = init.toCharArray();
            int len = chars.length;
            int count = 0;
            if(len > 1) {
                for(int j=0; j<len-1; j++) {
                    count++;
                    if(chars[j] == chars[j+1]){
                        if(j+1 == len-1){
                            count++;
                            init += count+""+chars[j+1];
                        }
                        continue;
                    } else {
                        if(j+1 == len-1){
                            count++;
                            init += 1+""+chars[j+1];
                        }
                        init += count +""+chars[i-1];
                        count = 0;
                    }
                }
            } else {
                init =  "1"+init;
            }
        }
        return init;
    }
}
