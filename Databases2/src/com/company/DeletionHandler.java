package com.company;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DeletionHandler implements ActionListener {
    TextField T1, T2, T3;
    Button B1, B2;
    Label L1, L2;

    public DeletionHandler(TextField t1, TextField t2, TextField t3, Button b1, Button b2, Label l1, Label l2) {
        T1 = t1;
        T2 = t2;
        T3 = t3;
        B1 = b1;
        B2 = b2;
        L1 = l1;
        L2 = l2;
    }

    public void actionPerformed(ActionEvent A) {
        Button Btn;
        Btn = (Button) A.getSource();
        String button;
        button = Btn.getLabel();
        if(button.equals("...")||button.equals("View")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
                Statement S = C.createStatement();
                String regno = T1.getText();
               // String name = T2.getText();
               // String marks = T3.getText();

                //S.executeUpdate("insert into school values(" + regno + ",'" + name + "'," + marks + ")");
                ResultSet R = S.executeQuery("select * from school");
                //System.out.println(regno);
                while (R.next()){
                    if (Integer.parseInt(regno)==R.getInt("RegNo")){
                        T2.setVisible(true);
                        T3.setVisible(true);
                        B1.setVisible(true);
                        L1.setVisible(true);
                        L2.setVisible(true);
                        T2.setText(R.getString("Name"));
                        T3.setText(Integer.toString(R.getInt("marks")));
                      // System.out.println(R.getString("Name"));
                      // System.out.println(Integer.toString(R.getInt("marks")));
                       return;
                    }
                    else{
                       T2.setText("");
                       T3.setText("");
                    }
                }

            } catch (Exception V) {
                System.out.println(V.toString());
            }
        }
        if (button.equals("Delete")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
                Statement S = C.createStatement();
                String regno = T1.getText();
                String name = T2.getText();
                String marks = T3.getText();
                S.executeUpdate("delete from school where Regno =" + regno);
               // ResultSet R = S.executeQuery("select RegNo from school");

            } catch (Exception V) {
                System.out.println(V.toString());
            }
        }


       if (button.equals("Edit")){
           try {
               Class.forName("com.mysql.jdbc.Driver");
               Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/QA", "root", "");
               Statement S = C.createStatement();
               String regno = T1.getText();
               String name = T2.getText();
               String marks = T3.getText();
               //System.out.println("update school set Name ='"+name+"', marks ="+marks+" where RegNo=" + regno);
               S.executeUpdate("update school set Name ='"+name+"', marks ="+marks+" where RegNo=" + regno );
               // ResultSet R = S.executeQuery("select RegNo from school");

           } catch (Exception V) {
               System.out.println(V.toString());
           }
       }
        T1.setText("");
        T2.setText("");
        T3.setText("");

        // F.setVisible(false);

    }

}
