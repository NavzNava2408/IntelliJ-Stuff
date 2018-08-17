package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Accounts Peter = new Accounts();
        try{
            Peter.CalculateSalary(1500,9);
        }
        catch(Boom A){
            System.out.println("Stop taking days off");
            JFrame frame = new JFrame();
            frame.add(new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop")),BorderLayout.CENTER);

            frame.setSize(500,500);
            frame.setVisible(true);


        }
    }
}
