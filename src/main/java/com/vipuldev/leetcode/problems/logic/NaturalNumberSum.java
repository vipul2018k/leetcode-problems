package com.vipuldev.leetcode.problems.logic;

public class NaturalNumberSum {
    public static void main(String []args){
        int n= 10;
        getNaturalNumberSum(n);
    }
    public static void getNaturalNumberSum(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+number+" Natural number sum = "+ sum);
    }
}
