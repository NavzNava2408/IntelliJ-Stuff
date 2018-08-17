package com.company;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame win= new Frame("Hello");
        Button B1 = new Button("Alpha Tango Squadron");
        Button B2 = new Button("Bravo Foxtrot Regimen");
        Button B3 = new Button ("DeltaForce");
        Button B4 = new Button ("DEFCON 5");
        Button B5 = new Button("SWAT Team");
        eventX E = new eventX(1);
        eventX E2 = new eventX(2);
        eventX E3 = new eventX(3);
        eventX E4 = new eventX(4);
        eventX E5 = new eventX(5);
        B1.addActionListener(E3);
        B3.addActionListener(E2);
        B2.addActionListener(E);
        B5.addActionListener(E4);
        B4.addActionListener(E5);
        win.add(B1,BorderLayout.NORTH);
        win.add(B2,BorderLayout.EAST);
        win.add(B3,BorderLayout.WEST);
        win.add(B4,BorderLayout.CENTER);
        win.add(B5,BorderLayout.SOUTH);
        win.setSize(400,400);
        win.setVisible(true);
    }
}
