package com.company;

public class Accounts {
    public void CalculateSalary(int Salary, int Absentees) throws Boom{
        float net = 0;
        if(Absentees>=8){
            Boom ABC = new Boom();
            throw ABC;
        }
    }
}
