package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;

public class SortArray {
    public static void main(String []args){
        int [] unsortedArr = new int[]{ 11,23,22,67,2,5,3,1,56,34};
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
