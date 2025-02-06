package com.vipuldev.leetcode.problems.logic;

public class SwapNumbers {
    public static void main(String []args){
        int a=2;
        int b=3;
        swapNumbers(a,b);

    }
    public static void  swapNumbers(int a,int b){
        System.out.println("Before swapping : value of a ="+a+" and value of b = "+b);
        int temp = a;
        a=b;
        b= temp;
        System.out.println("After swapping :value of a = "+a +" and value of b = "+b);
    }
}
