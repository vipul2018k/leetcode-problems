package com.vipuldev.leetcode.problems.logic;

import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String []args){
        int [] arr = new int[]{100,90,10,20,40,30,50,70,60,80};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("All elements are in an AP ? : "+isAllElementAP(arr));
    }

    public static boolean isAllElementAP(int [] arr){
        int cd = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1] -arr[i] ) != cd){
                return false;
            }
        }
        return true;
    }

    public static void quickSort(int [] arr,int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    public static int partition(int [] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
