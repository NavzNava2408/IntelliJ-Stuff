package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int Bill,Paid, Balance;
        Bill=20;
        Paid=40;
        Balance=Paid-Bill;
        int FiftyPound, TwentyPound, TenPound, FivePound, TwoPound, OnePound;
        FiftyPound=0;
        TwentyPound=0;
        TenPound=0;
        FivePound=0;
        TwoPound=0;
        OnePound=0;
        System.out.println("Balance:"+Balance);
        if (((Balance/50)>0)) FiftyPound = Balance/50;
        if (((Balance%50))>0) TwentyPound=(Balance%50)/20;
        if ((((Balance%50)%20)>0)) TenPound=(((Balance%50)%20)/10);
        if ((((Balance%50)%20)%10)>0) FivePound=((((Balance%50)%20)%10)/5);
        if (((((Balance%50)%20)%10)%5)>0) TwoPound=(((((Balance%50)%20)%10)%5)/2);
        if ((((((Balance%50)%20)%10)%5)%2)>0) OnePound=((((((Balance%50)%20)%10)%5)%2)/1);
        if (FiftyPound>0) System.out.println("£50:"+FiftyPound);
        if (TwentyPound>0) System.out.println("£20:"+TwentyPound);
        if (TenPound>0) System.out.println("£10:"+TenPound);
        if (FivePound>0) System.out.println("£5:"+FivePound);
        if (TwoPound>0) System.out.println("£2:"+TwoPound);
        if (OnePound>0) System.out.println("£1:"+OnePound);


    }
}
