package com.company;

public class BinarySwap {

    public void swap(int A) {
        int B;
        String X;
        X = "";
        if (A < 32 && A >= 16) {
            B = 16;
            if (A % B !=0)
                X = X + "1";
            else
                X = X+ "0";
            A = A % B;
            B = B - (B/2);
            }
        else
            X = X+ "0";
        if (A < 16 && A >= 8) {
            B = 8;
            if (A % B != 0)
                X = X + "1";
            else
                X = X + "0";
            A = A % B;
            B = B - (B / 2);
        }
        else
            X = X+ "0";
        if (A < 8 && A >= 4) {
            B = 4;
            if (A % B != 0)
                X = X + "1";
            else
                X = X + "0";
            A = A % B;
            B = B - (B / 2);
        }
        else
            X = X+ "0";
        if (A < 4 && A >= 2 ) {
            B = 2;
            if (A % B != 0)
                X = X + "1";
            else
                X = X + "0";
            A = A % B;
            B = B - (B / 2);
        }
        else
            X = X+ "0";
        if (A==1)
        X = X + "1";
        else
            X = X+ "0";
        System.out.println(X);
        }
    }

