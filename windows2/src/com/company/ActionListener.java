package com.company;
import java.awt.event.*;

 class eventX implements ActionListener {
     int type_button;
     static int c=0, d=0, e=0, f=0;

     public eventX(int x) {
         type_button = x;
     }

     public void actionPerformed(ActionEvent a) {


         if (type_button==1){ System.out.println("EastSide Activate"); c++;
         }
         if (type_button==2) {
             System.out.println("WestSide Activate");
             d++;
         }
         if (type_button==3) {
             System.out.println("NorthSide Activate");
             e++;
         }
         if (type_button==4) {
             System.out.println("SouthSide Activate");
             f++;
         }
         if (type_button==5) {
             if (c >0 & d>0 & e>0 & f>0) {
                 System.out.println("Avengers Assemble");
             }
             else{
                 System.out.println("Total Activation Required");
             }

         }



     }
 }
    //public void actionPerformed(ActionEvent x){
  //      System.out.println("EastSide Activate");
    //}

//class eventY implements ActionListener{
     //public void actionPerformed(ActionEvent Y){
       //  System.out.println("WestSide Activate");
     //}
//}

//class eventZ implements ActionListener{
//     public void actionPerformed(ActionEvent Z){
  //       System.out.println("NorthSide Activate");
    // }
//}

//class eventA implements ActionListener{
    // public void actionPerformed (ActionEvent A){
    //     System.out.println("Avengers Assemble");
  //   }
//}

//class eventB implements ActionListener{
     //public void actionPerformed (ActionEvent B){
    //     System.out.println("SouthSide Activate");
  //   }
//}