package com.vipuldev.leetcode.problems.logic;

public class EvenOrOdd {
    public static void main(String []args){
        int n = 10;
        int m = 11;
        System.out.println(checkNumber(n));
        System.out.println(checkNumber(m));
    }

    public static String checkNumber(int number){
        if(number % 2 ==0){
            return number +" is an even number";
        }else{
            return number +" is an odd number";
        }
    }
}
