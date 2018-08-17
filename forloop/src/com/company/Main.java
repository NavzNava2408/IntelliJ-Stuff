package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A,B;
        for(A=1;A<=10;A++) {
            System.out.println("Times Table of" + A);
            System.out.println("--------------------");
            for (B = 1; B <= 10; B++)
                System.out.println((A + "x" + B + "=" + (A * B)));
            System.out.println();
        }
    }
}
