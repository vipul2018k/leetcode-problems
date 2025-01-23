package com.vipuldev.leetcode.problems.sum;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class BinarySearchUsingQuickSort {
    public static void main(String [] args){
        int [] arr = IntStream.generate(()-> new Random().nextInt(1000)).limit(1000).toArray();
        quickSort(arr,0,arr.length-1);
        int key = 555;
        System.out.println("Sorted Array:"+ Arrays.toString(arr));
    }

    public static void quickSort(int []arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int []arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
