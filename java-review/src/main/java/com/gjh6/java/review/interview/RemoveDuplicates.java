package com.gjh6.java.review.interview;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrays = {1,1,2};
        int i = removeDuplicates(arrays);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int repCount = 0;
        for(int i=0; i<nums.length-1; i++) {
            for(int j=1; j<nums.length; j++) {
                if(nums[i] != Integer.MAX_VALUE && nums[i] == nums[j]){
                    repCount++;
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] != Integer.MAX_VALUE){
                if(i==nums.length-1){
                } else {
                    for(int j=i; j<nums.length-1; j++){
                        nums[j] = nums[j++];
                    }
                }
            }
        }
        try {
            for(int i=nums.length-1; i>=0; i--) {
                System.out.println(nums[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nums.length - repCount;
    }
}
