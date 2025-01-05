package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;

public class TwoSum {

    public static void main(String []args){
        int [] numberArr = new int[]{2,11,15,7};
        int target = 9;// target - x = y;
        System.out.println(Arrays.toString(twoSum(numberArr, target)));
    }

    public static int[] twoSum(int [] numberArr,int target){
        for(int i=0; i < numberArr.length ; i++){
            for(int j=i+1 ;j < numberArr.length ; j++){
                if(numberArr[i] + numberArr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return numberArr;
    }
}
