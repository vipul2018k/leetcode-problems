package com.vipuldev.leetcode.problems.sum;

import java.util.*;
import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String []args){
        //binary search should use for large sorted array
        int [] unsortedArr = IntStream.generate(()-> new Random().nextInt(100)).limit(100).toArray();
       // System.out.println("UnSorted Array :" + Arrays.toString(unsortedArr));
        quickSort(unsortedArr,0,unsortedArr.length-1);
       System.out.println("Sorted Array :" + Arrays.toString(unsortedArr));
    }


    public static void quickSort(int [] unsortedArr,int low,int high){
        if(low< high){
            int pi = partition(unsortedArr,low,high);
            quickSort(unsortedArr,low,pi-1);
            quickSort(unsortedArr,pi+1,high);
        }
    }

    public static int partition(int [] unsortedArr,int low,int high){
        int pivot = unsortedArr[high];
        int i = low -1;
        for(int j=low;j<=high-1;j++){
            if(unsortedArr[j]< pivot){
                i++;
                swapArrayElement(unsortedArr,i,j);
            }
        }
        swapArrayElement(unsortedArr,i+1,high);
        return i+1;
    }

    public static void swapArrayElement(int [] unsortedArr,int i,int j){
        int temp = unsortedArr[i];
        unsortedArr[i] = unsortedArr[j];
        unsortedArr[j] = temp;
    }
}
