package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float Salary;
        float Tax=0, Net;
        Salary = 2125;
        if(Salary<1000) Tax=Salary*5/100;
        else if (Salary>=1000 & Salary<2000) Tax=Salary*15/100;
        else if (Salary>=2000 & Salary<3000) Tax=Salary*17/100;
        else if(Salary>=3000 & Salary<4000) Tax=Salary*21/100;
        else if (Salary>=4000) Tax=Salary*25/100;
        Net = Salary - Tax;
        System.out.println(Salary);
        System.out.println(Tax);
        System.out.println(Net);

    }
}
