package com.company;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class EventHandler implements ActionListener{
    //TextField T1, T2, T3;
    Button B1, B2, B3, B4;
    public EventHandler(Button b1, Button b2, Button b3, Button b4){
        B1 = b1;
        B2 = b2;
        B3 = b3;
        B4 = b4;
    }

    public void actionPerformed(ActionEvent A){
        Button Btn;
        Btn = (Button) A.getSource();
        String what;
        what = Btn.getLabel();
        if(what.equals("Entry")){
            Frame F = new Frame("Enter Details");
            FlowLayout Fl = new FlowLayout();
            Font Fon = new Font(Font.SERIF,Font.BOLD,16);
            Font Font = new Font(java.awt.Font.SERIF, java.awt.Font.ITALIC,14);
            F.setLayout(Fl);
            TextField T1 = new TextField(5);
            TextField T2 = new TextField(20);
            TextField T3 = new TextField(5);
            Label La1 = new Label("Reg No");
            La1.setFont(Font);
            Label La2 = new Label("Name");
            La2.setFont(Font);
            Label La3 = new Label("Marks");
            La3.setFont(Font);
            Button Bu1 = new Button("Enter");
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
            EntryHandler E = new EntryHandler(T1, T2, T3, Bu1);
            Bu1.addActionListener(E);

            F.setSize(500, 300);
            F.setBackground(Color.PINK);
            F.setVisible(true);
            ClosingHandler M = new ClosingHandler(F);
            F.addWindowListener(M);


        }

        if (what.equals("Delete")){
            Frame D = new Frame("Delete Details");
            FlowLayout Fl = new FlowLayout();
            Font F = new Font(Font.SERIF,Font.BOLD,16);
            Font f = new Font(Font.SERIF,Font.ITALIC,14);
            GridLayout G = new GridLayout(6,3);
            D.setLayout(G);
            TextField t1 = new TextField(5);
            t1.setBackground(Color.LIGHT_GRAY);
            TextField t2 = new TextField(10);
            t2.setBackground(Color.LIGHT_GRAY);
            t2.setVisible(false);
            TextField t3 = new TextField(5);
            t3.setBackground(Color.LIGHT_GRAY);
            t3.setVisible(false);
            Label l1 = new Label("Reg No");
            l1.setFont(f);
            l1.setBackground(Color.orange);
            Label l2 = new Label("Name");
            l2.setFont(f);
            l2.setVisible(false);
            l2.setBackground(Color.orange);
            Label l3 = new Label("Marks");
            l3.setFont(f);
            l3.setVisible(false);
            l3.setBackground(Color.orange);
            Button b1 = new Button("Delete");
            b1.setFont(F);
            b1.setVisible(false);
            b1.setBackground(Color.cyan);
            Button b2 = new Button("...");
            b2.setBackground(Color.cyan);
            b2.setFont(F);
            Label Lab1 = new Label();
            Label Lab2 = new Label();
            Label Lab3 = new Label();
            Label Lab4 = new Label();
            Lab1.setBackground(Color.pink);
            Lab2.setBackground(Color.pink);
            Lab3.setBackground(Color.pink);
            Lab4.setBackground(Color.pink);
            Label Lab5 = new Label();
            Lab5.setBackground(Color.pink);
            Label Lab6 = new Label();
            Lab6.setBackground(Color.pink);
            Label Lab7 = new Label();
            Lab7.setBackground(Color.pink);
            Label Lab8 = new Label();
            Lab8.setBackground(Color.pink);
            Label Lab9 = new Label();
            Lab9.setBackground(Color.pink);
            Label Lab10 = new Label();
            Lab10.setBackground(Color.pink);

            D.add(Lab5);
            D.add(Lab6);
            D.add(Lab7);

            D.add(l1);
            D.add(t1);
            D.add(b2);

            D.add(l2);
            D.add(t2);
            D.add(Lab1);

            D.add(l3);
            D.add(t3);
            D.add(Lab2);

            D.add(Lab3);
            D.add(Lab4);
            D.add(Lab10);

            D.add(Lab8);
            D.add(Lab9);
            D.add(b1);

            D.setSize(550,300);
            D.setVisible(true);
            D.setBackground(Color.PINK);
            DeletionHandler V = new DeletionHandler(t1,t2,t3,b1,b2,l2,l3);
            b2.addActionListener(V);
            b1.addActionListener(V);
            ClosingHandler M = new ClosingHandler(D);
            D.addWindowListener(M);

        }
        if (what.equals("View")){
            Frame N = new Frame("View Info");
            FlowLayout Fl = new FlowLayout();
            Font F = new Font(Font.SERIF,Font.BOLD,16);
            Font f = new Font(Font.SERIF,Font.ITALIC,14);
            GridLayout G = new GridLayout(9,3);
            N.setLayout(Fl);
            TextField t1 = new TextField(5);
            t1.setBackground(Color.LIGHT_GRAY);
            TextField t2 = new TextField(10);
            t2.setBackground(Color.LIGHT_GRAY);
            TextField t3 = new TextField(5);
            t3.setBackground(Color.LIGHT_GRAY);
            Label l1 = new Label("Reg No");
            l1.setFont(f);
            l1.setBackground(Color.orange);
            Label l2 = new Label("Name");
            l2.setFont(f);
            l2.setBackground(Color.orange);
            Label l3 = new Label("Marks");
            l3.setFont(f);
            l3.setBackground(Color.orange);
            Button b2 = new Button("View");
            b2.setBackground(Color.cyan);
            b2.setFont(F);
            Button b1 = new Button();


            N.add(l1);
            N.add(t1);
            N.add(l2);
            N.add(t2);
            N.add(l3);
            N.add(t3);
            N.add(b2);


            N.setSize(550,300);
            N.setVisible(true);
            N.setBackground(Color.PINK);
            DeletionHandler V = new DeletionHandler(t1,t2,t3,b1,b2,l1,l2);
            b2.addActionListener(V);
            b1.addActionListener(V);
            ClosingHandler M = new ClosingHandler(N);
            N.addWindowListener(M);


        }
        if (what.equals("Edit")){
            Frame K = new Frame("Edit Info");
            FlowLayout Fl = new FlowLayout();
            Font F = new Font(Font.SERIF,Font.BOLD,16);
            Font f = new Font(Font.SERIF,Font.ITALIC,14);
            GridLayout G = new GridLayout(9,3);
            K.setLayout(Fl);
            TextField t1 = new TextField(5);
            t1.setBackground(Color.LIGHT_GRAY);
            TextField t2 = new TextField(10);
            t2.setBackground(Color.LIGHT_GRAY);
            TextField t3 = new TextField(5);
            t3.setBackground(Color.LIGHT_GRAY);
            Label l1 = new Label("Reg No");
            l1.setFont(f);
            l1.setBackground(Color.orange);
            Label l2 = new Label("Name");
            l2.setFont(f);
            l2.setBackground(Color.orange);
            Label l3 = new Label("Marks");
            l3.setFont(f);
            l3.setBackground(Color.orange);
            Button b1 = new Button("Edit");
            b1.setFont(F);
            b1.setBackground(Color.cyan);
            Button b2 = new Button("...");
            b2.setBackground(Color.cyan);
            b2.setFont(F);


            K.add(l1);
            K.add(t1);
            K.add(b2);
            K.add(l2);
            K.add(t2);
            K.add(l3);
            K.add(t3);
            K.add(b1);

            K.setSize(550,300);
            K.setVisible(true);
            K.setBackground(Color.PINK);
            DeletionHandler V = new DeletionHandler(t1,t2,t3,b1,b2,l2,l3);
            b2.addActionListener(V);
            b1.addActionListener(V);
            ClosingHandler M = new ClosingHandler(K);
            K.addWindowListener(M);

        }

    //    try{
    //        Class.forName("com.mysql.jdbc.Driver");
    //        Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA","root","");
    //        Statement S = C.createStatement();
    //        String regno = T1.getText();
    //        String name = T2.getText();
    //        String marks = T3.getText();
    //        S.executeUpdate("insert into school values("+regno+",'"+name+"',"+ marks +")");
    //        S.executeQuery("select * from school");
    //    }
    //    catch(Exception V){
    //        System.out.println(V.toString());
    //    }
    //    T1.setText("");
    //    T2.setText("");
    //    T3.setText("");

    }
}
