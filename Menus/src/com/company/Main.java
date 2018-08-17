package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame F = new JFrame("Hello");
        Font Font = new Font(java.awt.Font.SERIF, java.awt.Font.BOLD,14);
        GridLayout G = new GridLayout(3,2);
        JMenuBar Bar = new JMenuBar();
        JMenu menu1 = new JMenu("Operations 1");
        JMenu menu2 = new JMenu("Operations 2");
        JMenuItem M1 = new JMenuItem("Addition");
        JMenuItem M2 = new JMenuItem("Subtraction");
        JMenuItem M3 = new JMenuItem("Multiplication");
        JMenuItem M4 = new JMenuItem("Division");
        int i;
        Label[] Lab = new Label[4];
        for (i=0;i>0 & i<4;i++) Lab[i] = new Label();
        JRadioButton RB1 = new JRadioButton("Hello");

        JLabel L1 = new JLabel("No1", SwingConstants.CENTER);
        L1.setForeground(Color.BLUE);
        L1.setBackground(Color.orange);
        L1.setOpaque(true);
        L1.setFont(Font);
        JLabel L2 = new JLabel("No2", SwingConstants.CENTER);
        L2.setForeground(Color.BLUE);
        L2.setBackground(Color.pink);
        L2.setOpaque(true);
        L2.setFont(Font);
        JLabel L3 = new JLabel("Result",SwingConstants.CENTER);
        //JLabel L3 = new JLabel("Result");
        L3.setBackground(Color.GRAY);
        L3.setForeground(Color.BLUE);
        L3.setOpaque(true);
        L3.setFont(Font);
        JTextField T1 = new JTextField(SwingConstants.CENTER);
        T1.setForeground(Color.MAGENTA);
        T1.setBackground(Color.LIGHT_GRAY);
        JTextField T2 = new JTextField(SwingConstants.CENTER);
        T2.setForeground(Color.MAGENTA);
        T2.setBackground(Color.LIGHT_GRAY);
        JTextField T3 = new JTextField(SwingConstants.CENTER);
        T3.setForeground(Color.MAGENTA);
        T3.setBackground(Color.LIGHT_GRAY);

        menu1.add(M1);
        menu1.add(M2);
        menu2.add(M3);
        menu2.add(M4);
        Bar.add(menu1);
        Bar.add(menu2);
        F.setJMenuBar(Bar);
        F.add(L1);
        F.add(T1);
        F.add(L2);
        F.add(T2);
        //F.add(L3);
        F.add(RB1);
        F.add(T3);
        F.setFont(Font);

        M1.addActionListener(
                new ActionListener(){
                    int A;
                    public void actionPerformed(ActionEvent a){
                        A = Integer.parseInt(T1.getText())+Integer.parseInt(T2.getText());
                        T3.setText(Integer.toString(A));
                    }

                }

        );
        M2.addActionListener(
                new ActionListener(){
                    int A;
                    public void actionPerformed(ActionEvent a){
                        A = Integer.parseInt(T1.getText())-Integer.parseInt(T2.getText());
                        T3.setText(Integer.toString(A));
                    }


                }
        );
        M3.addActionListener(
                new ActionListener(){
                    int A;
                    public void actionPerformed(ActionEvent a){
                        A = Integer.parseInt(T1.getText())*Integer.parseInt(T2.getText());
                        T3.setText(Integer.toString(A));
                    }


                }
        );
        M4.addActionListener(
                new ActionListener(){
                    int A;
                    public void actionPerformed(ActionEvent a){
                        A = Integer.parseInt(T1.getText())/Integer.parseInt(T2.getText());
                        T3.setText(Integer.toString(A));
                    }


                }
        );

        F.setVisible(true);
        F.setBackground(Color.orange);
        F.setLayout(G);
        F.setSize(400,400);
    }
}
