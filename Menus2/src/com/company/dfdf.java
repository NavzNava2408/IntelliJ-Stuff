package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;

   class dfdf {

    public static void asd(String[] args) {
        // write your code here
        JFrame F = new JFrame("Hello");
        Font Font = new Font(java.awt.Font.SERIF, java.awt.Font.BOLD,14);
        GridLayout G = new GridLayout(3,2);
        JMenuBar Bar = new JMenuBar();
        // JMenu menu1 = new JMenu("Operations 1");
        // JMenu menu2 = new JMenu("Operations 2");
        JMenu M1 = new JMenu("Entry");
        JMenu M2 = new JMenu("View");
        JMenu M3 = new JMenu("Edit");
        JMenu M4 = new JMenu("Delete");
        // int i;
        // Label[] Lab = new Label[4];
        // for (i=0;i>0 & i<4;i++) Lab[i] = new Label();
        //JRadioButton RB1 = new JRadioButton("Hello");
        //menu1.add(M1);
        //menu1.add(M2);
        //menu2.add(M3);
        //menu2.add(M4);
        Bar.add(M1);
        Bar.add(M2);
        Bar.add(M3);
        Bar.add(M4);
        F.setJMenuBar(Bar);

        F.setFont(Font);
        M1.addActionListener(
                //System.out.println("Hi");
                new ActionListener(){
                    public void actionPerformed(ActionEvent A){
                        //Frame F = new Frame("Enter Details");
                        System.out.println("Hi");
                        FlowLayout Fl = new FlowLayout();
                        Font Fon = new Font(Font.SERIF,Font.BOLD,16);
                        Font Font = new Font(java.awt.Font.SERIF, java.awt.Font.ITALIC,14);
                        F.setLayout (Fl);
                        JTextField T1 = new JTextField(5);
                        JTextField T2 = new JTextField(20);
                        JTextField T3 = new JTextField(5);
                        JLabel La1 = new JLabel("Reg No");
                        La1.setFont(Font);
                        JLabel La2 = new JLabel("Name");
                        La2.setFont(Font);
                        JLabel La3 = new JLabel("Marks");
                        La3.setFont(Font);
                        JButton Bu1 = new JButton("Enter");
                        Bu1.setFont(Fon);
                        //  float c,d,e;
                        La1.setBackground(Color.orange);
                        La2.setBackground(Color.orange);
                        La3.setBackground(Color.orange);
                        T1.setBackground(Color.LIGHT_GRAY);
                        T2.setBackground(Color.LIGHT_GRAY);
                        T3.setBackground(Color.LIGHT_GRAY);
                        Bu1.setBackground(Color.cyan);

                        F.add(La1);
                        F.add(T1);
                        F.add(La2);
                        F.add(T2);
                        F.add(La3);
                        F.add(T3);
                        F.add(Bu1);
                        T1.setSize(10,2);
                        T2.setSize(10,2);
                        T3.setSize(10,2);

                        Bu1.addActionListener(

                                new ActionListener(){

                                    public void actionPerformed(ActionEvent A){
                                        try{
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA","root","");
                                            Statement S = C.createStatement();
                                            String regno = T1.getText();
                                            String name = T2.getText();
                                            String marks = T3.getText();
                                            S.executeUpdate("insert into school values("+regno+",'"+name+"',"+ marks +")");
                                            S.executeQuery("select * from school");
                                        }
                                        catch(Exception V){
                                            System.out.println(V.toString());
                                        }
                                        T1.setText("");
                                        T2.setText("");
                                        T3.setText("");
                                        // F.setVisible(false);



                                    }
                                }
                        );

                        F.setSize(500, 300);
                        F.setBackground(Color.PINK);
                        F.setVisible(true);
                        ClosingHandler M = new ClosingHandler(F);
                        F.addWindowListener(M);

                    }

                }

        );


        F.setVisible(true);
        F.setBackground(Color.orange);
        F.setLayout(G);
        F.setSize(400,400);
    }
}
