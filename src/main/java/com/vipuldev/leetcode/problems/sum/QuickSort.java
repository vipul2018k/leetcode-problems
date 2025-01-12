package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;

public class QuickSort {
    public static void main(String [] args){
        int [] unsortedArr = new int[]{11,23,22,67,2,5,3,1,56,34};
        quickSort(unsortedArr,0,unsortedArr.length-1);
        System.out.println("Sorted Array: "+ Arrays.toString(unsortedArr));
    }

    public static void quickSort(int [] unsortedArr,int low,int high){

        if(low < high){
            int pi = partition(unsortedArr,low,high);
            quickSort(unsortedArr,low,pi-1);
            quickSort(unsortedArr,pi+1,high);

        }

    }

    public static int partition(int [] unsortedArr,int low,int high){
        int pivot = unsortedArr[high];
        int i = low-1;
        for(int j= low;j<high-1;j++){
            if(unsortedArr[j] < pivot){
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
