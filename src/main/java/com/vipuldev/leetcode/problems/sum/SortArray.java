package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;

public class SortArray {
    public static void main(String []args){
        int [] unsortedArr = new int[]{23,33,44,55,11,10,2,3,5,0,8,7,21,14,13};
        getSortedArr(unsortedArr);
        System.out.println("Sorted Array: "+ Arrays.toString(unsortedArr));
    }

    public static void getSortedArr(int [] unsortedArr){
        for(int i=0;i<unsortedArr.length;i++){
            for(int j=i+1;j<unsortedArr.length;j++){
                if(unsortedArr[i] > unsortedArr[j]){
                    swapArrayElement(unsortedArr,i,j);
                }
            }
        }
    }

    public static void swapArrayElement(int [] unsortedArr,int i,int j){
        int temp = unsortedArr[i];
        unsortedArr[i] = unsortedArr[j];
        unsortedArr[j] = temp;
    }
}
