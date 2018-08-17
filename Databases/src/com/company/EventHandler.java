package com.company;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EventHandler implements ActionListener {
    TextField T1, T2, T3;
    Button B1;
    public EventHandler(TextField t1, TextField t2, TextField t3, Button b1){
        T1 = t1;
        T2 = t2;
        T3 = t3;
        B1 = b1;
    }

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

    }
}
