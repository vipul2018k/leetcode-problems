package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizedTwoSum {
    public static void main(String []args){
        int [] numberArr = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numberArr,target)));
    }

    public static int [] twoSum(int []numberArr,int target){
        int [] result = new int[2];
        Map<Integer,Integer> numberIndexMap = new HashMap<>();
        for(int i=0;i<numberArr.length;i++){
            int secondNumber = target - numberArr[i];
            if(numberIndexMap.containsKey(secondNumber)){
                result = new int[]{i,numberIndexMap.get(secondNumber)};
            }
            numberIndexMap.put(numberArr[i],i);
        }
        return result;
    }
}
