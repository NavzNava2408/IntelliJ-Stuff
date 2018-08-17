package com.company;

public class RESULTS {
    private int Phy, Che, Mat;
    String Name;
    int count;
    private float Tot, Per;
    public void PrintName(){
        System.out.println(Name+":");
    }
    public void Physics(int A){
        count=0;
        if (A>=0 & A<=150){
            Phy=A;
            if ((Phy*100/150)<60){
                Phy=-1;
                System.out.println("Failed Physics Exam");
                count++;
            }
            else{
                Phy=A*100/150;}
        }
            else{
            Phy=-1;
            System.out.println("invalid physics marks");
        }
    }
    public void Chemistry(int B){
        if (B>=0 & B<=150){ Che=B;
            if ((Che*100/150)<60){
                Che=-1;
                System.out.println("Failed Chemistry Exam");
                count++;
            }
            else {
                Che=B*100/150;
            }

        }
        else {
            Che=-1;
            System.out.println("invalid chemistry marks");}
    }
    public void Maths(int C){
        if (C>=0 & C<=150){Mat=C;
         if ((Mat*100/150)<60){
             Mat=-1;
             System.out.println("Failed Maths Exam");
             count++;
         }
         else {
             Mat=C*100/150;
         }
        }
        else {
            Mat=-1;
            System.out.println("invalid maths marks");}
    }
    public void showResults(){
        switch (count){
            case 1:
                System.out.println("Retake exam");
                break;
            case 2:
                System.out.println("Repeat the course");
                break;
            case 3:
                System.out.println("Go home fool!!");

                }

        if (Phy>=0 & Che>=0 & Mat>=0){
            Tot = Phy + Che + Mat;
            Per = Tot*100/450;
            System.out.println("Total:"+Tot);
            System.out.println("Percentage:"+Per);
            System.out.println();}

        System.out.println();

        }

    }

