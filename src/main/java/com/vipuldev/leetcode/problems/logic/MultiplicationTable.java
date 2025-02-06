package com.vipuldev.leetcode.problems.logic;

public class MultiplicationTable {
    public static void main(String []args){
        int n = 5;
        printTable(n);
    }
    public static void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i +" = " + (number * i));
        }
    }
}
