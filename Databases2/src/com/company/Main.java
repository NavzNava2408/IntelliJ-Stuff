package com.company;
import java.sql.*;
import java.awt.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Frame win = new Frame("QA");
        FlowLayout Fl = new FlowLayout();
        GridLayout Gr = new GridLayout(9,3);
        Font fo = new Font(Font.SERIF,Font.BOLD,18);
        win.setLayout(Gr);
        //TextField T1 = new TextField(5);
        //TextField T2 = new TextField(20);
        //TextField T3 = new TextField(5);
        Label L1 = new Label();
        Label L2 = new Label();
        Label L3 = new Label();
        Label L4 = new Label();
        Button B1 = new Button("Entry");
        Label L5 = new Label();
        Label L6 = new Label();
        Label L7 = new Label();
        Label L8 = new Label();
        Label L9 = new Label();
        Button B2 = new Button("View");
        Label L10 = new Label();
        Label L11 = new Label();
        Label L12 = new Label();
        Label L13 = new Label();
        Label L14 = new Label();
        Button B3 = new Button("Edit");
        Label L15 = new Label();
        Label L16 = new Label();
        Label L17 = new Label();
        Label L18 = new Label();
        Label L19 = new Label();
        Button B4 = new Button("Delete");
        Label L20 = new Label();
        Label L21 = new Label();
        Label L22 = new Label();
        Label L23 = new Label();
        B1.setFont(fo);
        B2.setFont(fo);
        B3.setFont(fo);
        B4.setFont(fo);

        float c,d,e;
      //  L1.setBackground(Color.pink);
      //  L2.setBackground(Color.pink);
      //  L3.setBackground(Color.pink);
       // T1.setBackground(Color.LIGHT_GRAY);
       // T2.setBackground(Color.LIGHT_GRAY);
       // T3.setBackground(Color.LIGHT_GRAY);
        B1.setBackground(Color.orange);
        B2.setBackground(Color.orange);
        B3.setBackground(Color.orange);
        B4.setBackground(Color.orange);
        L1.setBackground(Color.RED);
        L2.setBackground(Color.pink);
        L3.setBackground(Color.RED);
        L4.setBackground(Color.pink);
        L5.setBackground(Color.pink);
        L6.setBackground(Color.RED);
        L7.setBackground(Color.pink);
        L8.setBackground(Color.RED);
        L9.setBackground(Color.pink);
        L10.setBackground(Color.pink);
        L11.setBackground(Color.RED);
        L12.setBackground(Color.pink);
        L13.setBackground(Color.RED);
        L14.setBackground(Color.pink);
        L15.setBackground(Color.pink);
        L16.setBackground(Color.RED);
        L17.setBackground(Color.pink);
        L18.setBackground(Color.RED);
        L19.setBackground(Color.pink);
        L20.setBackground(Color.pink);
        L21.setBackground(Color.RED);
        L22.setBackground(Color.pink);
        L23.setBackground(Color.RED);

        win.add(L1);
        win.add(L2);
        win.add(L3);
        win.add(L4);
        win.add(B1);
        win.add(L5);
        win.add(L6);
        win.add(L7);
        win.add(L8);
        win.add(L9);
        win.add(B2);
        win.add(L10);
        win.add(L11);
        win.add(L12);
        win.add(L13);
        win.add(L14);
        win.add(B3);
        win.add(L15);
        win.add(L16);
        win.add(L17);
        win.add(L18);
        win.add(L19);
        win.add(B4);
        win.add(L20);
        win.add(L21);
        win.add(L22);
        win.add(L23);
      //  T1.setSize(10,2);
      //  T2.setSize(10,2);
      //  T3.setSize(10,2);
      EventHandler E = new EventHandler(B1, B2, B3, B4);
      B1.addActionListener(E);
      B2.addActionListener(E);
      B3.addActionListener(E);
      B4.addActionListener(E);

        win.setSize(500, 500);
        win.setVisible(true);
        win.setBackground(Color.orange);
        ClosingHandler M = new ClosingHandler(win);
        win.addWindowListener(M);
      //  while (true) {
        //    for (c = 0; c <= 250; c++) {
        //        for (d = 0; d <= 250; d++) {
        //            for (e = 0; e <= 250; e++) {
        //                win.setBackground(Color.getHSBColor(c, d, e));
        //            }
        //        }
        //    }
       // }


    }
}
