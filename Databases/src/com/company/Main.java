package com.company;
import java.sql.*;
import java.awt.*;




public class Main {

   // public static void main2(String[] args) {
        // write your code here
//        try{
        //           Class.forName("com.mysql.jdbc.Driver");
        //           Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA","root","");
        //           Statement S = C.createStatement();
        //           ResultSet R = S.executeQuery("Select * From School");
        //           while (R.next()){
        //               System.out.print(R.getInt("RegNo"));
        //             System.out.print(R.getString("Name"));
        //           System.out.println();
        //         }
//        }
//        catch(Exception A){
//            System.out.println(A.toString());
        //       }
        // }

        public static void main(String [] args) {
            // write your code here
            //     try{
            //       Class.forName("com.mysql.jdbc.Driver");
            //       Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA","root","");
            //      Statement S = C.createStatement();
            //      S.executeUpdate("insert into school values(567,'shafeeq',150)");
            //    }
            //   catch(Exception A){
            //     System.out.println(A.toString());}

            Frame win = new Frame("School");
            FlowLayout Fl = new FlowLayout();
            win.setLayout(Fl);
            TextField T1 = new TextField(5);
            TextField T2 = new TextField(20);
            TextField T3 = new TextField(5);
            Label L1 = new Label("Reg No");
            Label L2 = new Label("Name");
            Label L3 = new Label("Marks");
            Button B1 = new Button("Enter");
            float c,d,e;
            L1.setBackground(Color.pink);
            L2.setBackground(Color.pink);
            L3.setBackground(Color.pink);
            T1.setBackground(Color.LIGHT_GRAY);
            T2.setBackground(Color.LIGHT_GRAY);
            T3.setBackground(Color.LIGHT_GRAY);
            B1.setBackground(Color.cyan);

            win.add(L1);
            win.add(T1);
            win.add(L2);
            win.add(T2);
            win.add(L3);
            win.add(T3);
            win.add(B1);
            T1.setSize(10,2);
            T2.setSize(10,2);
            T3.setSize(10,2);
            EventHandler E = new EventHandler(T1, T2, T3, B1);
            B1.addActionListener(E);

            win.setSize(500, 500);
            win.setVisible(true);
            while (true) {
                for (c = 0; c <= 250; c++) {
                    for (d = 0; d <= 250; d++) {
                        for (e = 0; e <= 250; e++) {
                            win.setBackground(Color.getHSBColor(c, d, e));
                        }
                    }
                }
            }



        }
    }

   // public static void main3 (String[] args) {

