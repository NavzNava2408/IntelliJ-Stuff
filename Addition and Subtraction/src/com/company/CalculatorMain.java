package com.company;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Button;
import java.awt.*;
import java.awt.event.*;
 class Main {

    public static void main(String[] args) {
	// write your code here
        FlowLayout Fl = new FlowLayout();
        TextField T1, T2, T3;
        Label L1,L2,L3;
        L1 = new Label("No1:");
        L2 = new Label ("No2:");
        L3 = new Label ("Result:");
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(50);
        Button B1, B2, B3, B4;
        B1 = new Button("+");
        B2 = new Button("-");
        B3 = new Button("*");
        B4 = new Button("/");

        Frame F = new Frame("Calculator");
        F.setLayout(Fl);
        F.add(L1);
        F.add(T1);
        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.add(B4);
        F.add(L2);
        F.add(T2);

        F.add(L3);
        F.add(T3);


        Addition E1 = new Addition(T1,T2,T3);
        Subtraction E2 = new Subtraction(T1,T2,T3);
        Multiplication E3 = new Multiplication(T1,T2,T3);
        Division E4 = new Division(T1,T2,T3);
        B1.addActionListener(E1);
        B2.addActionListener(E2);
        B3.addActionListener(E3);
        B4.addActionListener(E4);

        F.setSize(400,400);
        F.setVisible(true);
        float c,d,e;
        while (true) {
            for (c = 0; c <= 250; c++) {
                for (d = 0; d <= 250; d++) {
                    for (e = 0; e <= 250; e++) {
                        F.setBackground(Color.getHSBColor(c, d, e));
                    }
                }
            }
        }

    }
}
