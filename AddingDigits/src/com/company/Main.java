package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int X;
        X = 333;
        int sum = 0;
        int num = X;
        while (num>0){
            int lastDigit = num%10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
