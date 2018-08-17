package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Name;
        int Salary;
        float Tax;
        float Net_Salary;
        Name = "Steve";
        Salary = 5000;
        if (Salary>=2000){
            Tax = Salary*21/100f;
            Net_Salary = Salary-Tax;
            System.out.println(Name);
            System.out.println(Salary);
            System.out.println(Tax);
            System.out.println(Net_Salary);
        }
        if (Salary<2000){
            Tax = Salary*19/100f;
            Net_Salary = Salary - Tax;
            System.out.println(Name);
            System.out.println(Salary);
            System.out.println(Tax);
            System.out.println(Net_Salary);}
    }
}
