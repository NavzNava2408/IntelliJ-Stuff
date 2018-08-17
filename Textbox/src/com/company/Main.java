package com.company;
import java.awt.*;
import java.awt.event.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame win= new Frame("Hello");
        //Button B1 = new Button("");
        Button B2 = new Button("Spain");
        Button B3 = new Button ("France");
        Button B4 = new Button ("HELLOO!!");
        //Button B5 = new Button("SWAT Team");
        TextField t = new TextField();
        TextField t2 = new TextField();
        EventHandler E = new EventHandler(t);
        EventA A = new EventA(t2);
       // eventX E = new eventX();
        //eventY E2 = new eventY();
        //eventZ E3 = new eventZ();
        //eventA E4 = new eventA();
        //eventB E5 = new eventB();
        //B1.addActionListener(E3);
        //B3.addActionListener(E2);
        B2.addActionListener(E);
        B3.addActionListener(A);
        //B4.addActionListener(E4);
        //B5.addActionListener(E5);
        //win.add(B1,BorderLayout.NORTH);
        win.add(B2,BorderLayout.EAST);
        win.add(B3,BorderLayout.WEST);
        win.add(B4,BorderLayout.CENTER);
        //win.add(B5,BorderLayout.SOUTH);
        win.add(t,BorderLayout.SOUTH);
        win.add(t2,BorderLayout.NORTH);
        win.setSize(400,400);
        win.setVisible(true);
    }
}
