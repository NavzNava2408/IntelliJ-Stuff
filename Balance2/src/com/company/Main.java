package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float Bill,Paid, Balance;
        Bill=20;
        Paid=100;
        Balance=Paid-Bill;
        float FiftyPound, TwentyPound, TenPound, FivePound, TwoPound, OnePound, FiftyPence, TwentyPence, TenPence, FivePence, TwoPence, OnePence;
        FiftyPound=0;
        TwentyPound=0;
        TenPound=0;
        FivePound=0;
        TwoPound=0;
        OnePound=0;
        FiftyPence=0;
        TwentyPence=0;
        TenPence=0;
        FivePence=0;
        TwoPence=0;
        OnePence=0;
        System.out.println("Balance:"+Balance);
        if (((Balance/50)>0)) FiftyPound = ((int)Balance/50);
        if (((Balance%50))>0) TwentyPound=((int)Balance%50)/20;
        if ((((Balance%50)%20)>0)) TenPound=((((int)Balance%50)%20)/10);
        if ((((Balance%50)%20)%10)>0) FivePound=(((((int)Balance%50)%20)%10)/5);
        if (((((Balance%50)%20)%10)%5)>0) TwoPound=((((((int)Balance%50)%20)%10)%5)/2);
        if ((((((Balance%50)%20)%10)%5)%2)>0) OnePound=(((((((int)Balance%50)%20)%10)%5)%2)/1);
        if (((((((Balance%50)%20)%10)%5)%2)%1)>0) FiftyPence= (((((((Balance%50)%20)%10)%5)%2)%1)/0.5f);
        if ((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)>0) TwentyPence= ((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)/0.2f);
        if (((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)%0.2f)>0) TenPence= (((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)%0.2f)/0.1f);
        if ((((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)%0.2f)%0.1f)>0) FivePence= ((((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)%0.2f)%0.1f)/0.05f);
        if (((((((((((Balance%50)%20)%10)%5)%2)%1)%0.5f)%0.2f)%0.1f)%0.05f)>0) TwoPence= 

        if (FiftyPound>0) System.out.println("£50:"+FiftyPound);
        if (TwentyPound>0) System.out.println("£20:"+TwentyPound);
        if (TenPound>0) System.out.println("£10:"+TenPound);
        if (FivePound>0) System.out.println("£5:"+FivePound);
        if (TwoPound>0) System.out.println("£2:"+TwoPound);
        if (OnePound>0) System.out.println("£1:"+OnePound);

    }
}
