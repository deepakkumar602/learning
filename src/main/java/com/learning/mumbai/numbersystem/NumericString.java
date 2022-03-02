package com.learning.mumbai.numbersystem;

public class NumericString {

    public boolean isDigitSum(int input){
        int num = 0;
        while(input > 0){
            num = num + input % 10;
            input = input / 10;
        }
        if(num == 6){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        NumericString digit = new NumericString();

        System.out.println("Enter integer value: ");
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println(digit.isDigitSum(input));
    }
}
