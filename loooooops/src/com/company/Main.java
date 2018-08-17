package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int A;
        int B;
        A = 10;
        while (A<=10) {
            B = 1;

            while (B <= A) {
                if (B<A) {
                    System.out.print(B + ",");
                    B++;
                }
                else {
                    System.out.println(B+".");
                    B++;
                }
            }

            A--;
        }
    }
}
