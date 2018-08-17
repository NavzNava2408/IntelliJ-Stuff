package com.company;

public class BinarySwap {
    public void swap(int Input) {
        int BinaryVal = 1;
        String Binary;
        Binary = "";
        for (; BinaryVal < Input; BinaryVal*2)
        if (Input < BinaryVal) {
            if (BinaryVal % 2 == 1)
                Binary= Binary + "1";
            else
                Binary = Binary + "0";
        }
    }
}
}
