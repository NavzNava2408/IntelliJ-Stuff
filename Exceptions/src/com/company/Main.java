package com.company;

public class Main {

    public static void main(String [] t) {
	// write your code here
        int A =0;
        int B=0;
        int Results = 0;
        try{
            A = Integer.parseInt(t[0]);
            B = Integer.parseInt(t[1]);
            Results = A/B;

        }
        catch(ArithmeticException AB){
            System.out.println("Cannot divide anything by zero");
        }
        catch (NumberFormatException N){
            System.out.println("Use Numeric like values only");
        }
        catch (IndexOutOfBoundsException O){
            System.out.println("Not enough inputs");
        }

        System.out.println("Bye");
    }
}
