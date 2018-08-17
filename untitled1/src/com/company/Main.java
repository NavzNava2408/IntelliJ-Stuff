package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Name;
        int Salary;
        float Tax=0;
        float Net_Salary;
        Name = "Steve";
        Salary = 5000;
        if (Salary>=2000) Tax=Salary*21/100;
        if (Salary<2000) Tax=Salary*19/100;
        Net_Salary = Salary - Tax;
        System.out.println(Name);


    }
}
