package com.vipuldev.leetcode.problems.logic;

public class ClosestNumber {
    public static void main(String [] args){
        int n=-15;
        int m = 6;
        System.out.println("Closest number to " + n + " is = "+findClosestNumber(n,m));
    }

    public static int findClosestNumber(int n,int m){
        int q = n/m;
        int firstClosestNumber = m*q;
        int secondClosestNumber = (m*n) >0 ? (m * (q+1)) : (m * (q-1));
        if(Math.abs(n-firstClosestNumber) < Math.abs(n-secondClosestNumber)){
            return firstClosestNumber;
        }else{
            return secondClosestNumber;
        }
    }
}
