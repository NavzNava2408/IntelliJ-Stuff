package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Phy, Che, Mat, Total;
        float Per;
        Phy = 80;
        Che = 80;
        Mat = 100;
        Total = Phy + Che + Mat;
        Per = (float) Total*100/450;
        System.out.println("Marks Obtained:"+Total);
        System.out.println("Percentage(%):"+Per);
    }
}
