package com.company;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
public class Addition implements ActionListener{
    TextField T1, T2, T3;
    public Addition (TextField a, TextField b, TextField c){
        T1 = a;
        T2 = b;
        T3 = c;
    }
    public void actionPerformed(ActionEvent A){
        int No1, No2, No3;
        try {
            No1 = Integer.parseInt(T1.getText());
            No2 = Integer.parseInt(T2.getText());
            No3 = No1 + No2;
            T3.setText(Integer.toString(No3));
        }
    catch(NumberFormatException z){

                T3.setText("Please enter integers");
            }
        }
}
 class Subtraction implements ActionListener{
    TextField T1,T2,T3;
    public Subtraction(TextField a, TextField b, TextField c){
        T1 = a;
        T2 = b;
        T3 = c;
    }
    public void actionPerformed(ActionEvent B){
        int No1, No2, No3;
        try {
            No1 = Integer.parseInt(T1.getText());
            No2 = Integer.parseInt(T2.getText());
            No3 = No1 - No2;
            T3.setText(Integer.toString(No3));
        }
        catch(NumberFormatException z){
            T3.setText("Please enter integers");
        }
    }
}

class Multiplication implements ActionListener{
    TextField T1,T2,T3;
    public Multiplication(TextField a, TextField b, TextField c){
        T1=a;
        T2=b;
        T3=c;
    }
    public void actionPerformed(ActionEvent C) {
        int No1, No2, No3;
        try {
            No1 = Integer.parseInt(T1.getText());
            No2 = Integer.parseInt(T2.getText());
            No3 = No1 * No2;
            T3.setText(Integer.toString(No3));
        }
        catch(NumberFormatException z){
            T3.setText("Please enter integers");
        }
    }
}

class Division implements ActionListener {
    TextField T1, T2, T3;

    public Division(TextField a, TextField b, TextField c) {
        T1 = a;
        T2 = b;
        T3 = c;
    }

    public void actionPerformed(ActionEvent C) {
        float No1, No2, No3;
        try {
            No1 = Float.parseFloat(T1.getText());
            No2 = Float.parseFloat(T2.getText());
            No3 = No1 / No2;
            T3.setText(Float.toString(No3));
        }
        catch(NumberFormatException z){
            T3.setText("Please Enter integers");
        }
        }
}