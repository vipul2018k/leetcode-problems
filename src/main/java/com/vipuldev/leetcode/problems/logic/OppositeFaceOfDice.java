package com.vipuldev.leetcode.problems.logic;

public class OppositeFaceOfDice {
    public static void main(String []args){
        int n = 1;
        System.out.println("Opposite face of dice = "+getOppositeFaceOfDice(n));
    }
    public static int getOppositeFaceOfDice(int num){
        return 7-num;
    }
}
