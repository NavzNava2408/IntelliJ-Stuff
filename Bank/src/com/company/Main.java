package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Main {
    static int c=0;
    static JPanel P = new JPanel();
    static JPanel P2 = new JPanel();
    static JPanel P3 = new JPanel();
   static String[] file = {"C:\\Users\\Admin\\Desktop\\bank-1.jpg", "C:\\Users\\Admin\\Desktop\\illustration_piggy-bank.png", "C:\\Users\\Admin\\Desktop\\money.jpg", "C:\\Users\\Admin\\Desktop\\banner_design-principles-for-a-central-bank-digital-currency.jpg", "C:\\Users\\Admin\\Desktop\\moremoney.jpeg"};


    //ImageIcon iconLogo_1 = new ImageIcon("C:\\Users\\Admin\\Desktop\\bank-1.jpg");
   // JLabel Lab = new JLabel("WELCOME TO THE BANK OF AWESOME");
    static JLabel Logo = new JLabel();
    static ImageIcon[] iconLogo = new ImageIcon[5];


    //ImageIcon iconLogo_2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\illustration_piggy-bank.png");
    //ImageIcon iconLogo_3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\money.jpg");
    // ImageIcon iconLogo_4 = new ImageIcon("C:\\Users\\Admin\\Desktop\\banner_design-principles-for-a-central-bank-digital-currency.jpg");
    //ImageIcon iconLogo_5 = new ImageIcon("C:\\Users\\Admin\\Desktop\\moremoney.jpeg");
    //for(;c>=0 & c<=5;){
    //   Logo.setIcon(iconLogo_c);


    // Logo.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\bank-1.jpg"));

    public static void main(String[] args) {
	// write your code here
        JFrame F= new JFrame("Welcome");
        //JPanel P = new JPanel();
        F.add(P);
        P.removeAll();
        GridLayout G = new GridLayout(9,3);
        int i;
        JLabel[] L = new JLabel[23];
        for(i=0;i>0 & i<=3;i++) L[i] = new JLabel();
        JLabel L4 = new JLabel("Username");
        for (i=0; i>4 & i<=8;i++) L[i] = new JLabel();
        JLabel L9 = new JLabel("Password");
        for (i=0; i>9 & i<=23;i++) L[i]=new JLabel();
        for(i=0; i>0 & i<=23; i++) L[i].setBackground(Color.RED);
        for (i=0; i>0 & i<=23; i++) L[i].setOpaque(true);
        L4.setBackground(Color.PINK);
        L4.setOpaque(true);
        L9.setBackground(Color.PINK);
        L9.setOpaque(true);

        JTextField T1 = new JTextField();
        T1.setBackground(Color.LIGHT_GRAY);
        T1.setOpaque(true);
        JPasswordField T2 = new JPasswordField();
        T2.setEchoChar('*');
        T2.setBackground(Color.LIGHT_GRAY);
        T2.setOpaque(true);
       // for (i=0;i>0 & i<=2;i++) T[i] = new JTextField();
        JButton B1 = new JButton("Login");
        JButton B2 = new JButton("Create User");
        for (i=0; i>0 & i<=3;i++) P.add(L[i]);
        P.add(L4);
        P.add(T1);
        for(i=0; i>4 & i<=8;i++) P.add(L[i]);
        P.add(L9);
        P.add(T2);
        for(i=0;i>9 & i<=14;i++) P.add(L[i]);
        P.add(B1);
        for (i=0;i>14 & i<=19;i++) P.add(L[i]);
        P.add(B2);
        for (i=0;i>19 & i<=23;i++) P.add(L[i]);
        F.setSize(500,500);
        P.setLayout(G);
        //F.setLayout(G);
        F.setVisible(true);
        B2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent A){
                        JFrame Fr = new JFrame("New User");
                        GridLayout G = new GridLayout(5,3);
                        JLabel lab4 = new JLabel("Name");
                        JLabel lab3 = new JLabel("Email Address");
                        JLabel lab1 = new JLabel("Set Username");
                        JLabel lab2 = new JLabel("Set Password");
                        JTextField t1 = new JTextField();
                        JTextField t2 = new JTextField();
                        JTextField t3 = new JTextField();
                        JTextField t4 = new JTextField();
                        //t2.setEchoChar((char)0);
                        Fr.setLayout(G);
                        JButton b1 = new JButton("Create User");
                        JLabel L1 = new JLabel();
                        JLabel L2 = new JLabel();
                        JLabel L3 = new JLabel();
                        JLabel L4 = new JLabel();
                        JLabel L5 = new JLabel();
                        JLabel L6 = new JLabel();
                        Fr.add(lab4);
                        Fr.add(t4);
                        Fr.add(L6);
                        Fr.add(lab3);
                        Fr.add(t3);
                        Fr.add(L5);
                        Fr.add(lab1);
                        Fr.add(t1);
                        Fr.add(L1);
                        Fr.add(lab2);
                        Fr.add(t2);
                        Fr.add(L2);
                        Fr.add(L3);
                        Fr.add(b1);
                        Fr.add(L4);
                        Fr.setSize(800,300);
                        Fr.setVisible(true);
                        b1.addActionListener(
                                new ActionListener(){
                                    public void actionPerformed(ActionEvent B){
                                        try{
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank","root","");
                                           // PreparedStatement Sp = C.prepareStatement("insert into create_user values(?,?,?,?,?,?,?,?,?)");
                                            String Username = t1.getText();
                                            String Email = t3.getText();
                                            String Password = t2.getText();
                                            String Name = t4.getText();
                                           // Sp.setString(1, "");
                                           // Sp.setString(2,"");
                                           // Sp.setString(3,"");
                                           // Sp.setString(4,"");
                                           // Sp.setString(5,Email);
                                           // Sp.setString(6,"");
                                           // Sp.setString(7,Username);
                                           // Sp.setString(8,Password);
                                           // Sp.setString(9,"");

                                            Statement S = C.createStatement();

                                            //String marks = T3.getText();
                                            //String query="insert into accuntHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())";
                                            //System.out.println("insert into accuntHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())");
                                            S.executeUpdate("insert into accountHolders values('"+Name+"','','"+Email+"','','"+Username+"','"+Password+"',now())");
                                            //S.executeQuery("select * from school");
                                        }
                                        catch(Exception V){
                                            System.out.println(V.toString());
                                        }
                                        t1.setText("");
                                        t2.setText("");
                                        t3.setText("");
                                        t4.setText("");
                                    }
                                }
                        );

                    }
        }
        );

        B1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent A) {
                        String username = T1.getText();
                        String password = new String(T2.getPassword());

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                            PreparedStatement Sp = C.prepareStatement("select * from accountholders where username = ? and Password = ?");
                            System.out.println("select * from accountholders where username = " + username + ",Password =" + password);
                            Sp.setString(1, username);
                            Sp.setString(2, password);
                            //ResultSet R = S.executeQuery("select * from accountHolders where username ='"+username+"'");
                            ResultSet R = Sp.executeQuery();

                            // System.out.println(T1.getText());
                            // System.out.println(R.getString("Username"));
                            // System.out.println(T2.getPassword());
                            // System.out.println(R.getString("Password"));
                            //if(username.equals(R.getString("Username")) & password.equals(R.getString("password"))){
                            if (!R.next()) {
                                T1.setText("");
                                T2.setText("");
                                return;
                            }
                        } catch (Exception e) {
                            return ;
                        }
                        //S.executeQuery("select * from accountHolders where username ='"+T1.getText()+"'");
                        //F.setVisible(false);
                        // JFrame Frame = new JFrame("Welcome");
                        F.remove(P);
                        F.remove(P2);
                        F.remove(P3);
                        //F.removeAll();
                        JPanel Pan = new JPanel();
                        JMenuBar Bar = new JMenuBar();
                        JMenu Menu1 = new JMenu("Users");
                        JMenu Menu2 = new JMenu("Admin");
                        JMenu Menu3 = new JMenu("Navigation");
                        JMenuItem M5 = new JMenuItem("See Reports");
                        JMenuItem M1 = new JMenuItem("Create Account");
                        JMenuItem M2 = new JMenuItem("Current Balance");
                        JMenuItem M3 = new JMenuItem("Get Statement");
                        JMenuItem M4 = new JMenuItem("Transfer Money");
                        JMenuItem M8 = new JMenuItem("Withdraw");
                        JMenuItem M9 = new JMenuItem ("Deposit");
                        JMenuItem M6 = new JMenuItem("LogOut");
                        JMenuItem M7 = new JMenuItem("Home");
                        //BufferedImage img = ImageIO.read(fc.getSelectedFile());
                        String[] file = new String[5];
                        file[0]="C:\\Users\\Admin\\Desktop\\bank-1.jpg";
                        file[1]="C:\\Users\\Admin\\Desktop\\illustration_piggy-bank.png";
                        file[2]="C:\\Users\\Admin\\Desktop\\money.jpg";
                        file[3]="C:\\Users\\Admin\\Desktop\\banner_design-principles-for-a-central-bank-digital-currency.jpg";
                        file[4]="C:\\Users\\Admin\\Desktop\\moremoney.jpeg";
                        ImageIcon[] iconLogo = new ImageIcon[5];
                        for(int i =0; i < 5; i++) iconLogo[i] = new ImageIcon(file[i]);

                        //ImageIcon iconLogo_1 = new ImageIcon("C:\\Users\\Admin\\Desktop\\bank-1.jpg");
                        JLabel Lab = new JLabel("WELCOME TO THE BANK OF AWESOME");
                        JLabel Logo = new JLabel();
                        //ImageIcon iconLogo_2 = new ImageIcon("C:\\Users\\Admin\\Desktop\\illustration_piggy-bank.png");
                        //ImageIcon iconLogo_3 = new ImageIcon("C:\\Users\\Admin\\Desktop\\money.jpg");
                       // ImageIcon iconLogo_4 = new ImageIcon("C:\\Users\\Admin\\Desktop\\banner_design-principles-for-a-central-bank-digital-currency.jpg");
                        //ImageIcon iconLogo_5 = new ImageIcon("C:\\Users\\Admin\\Desktop\\moremoney.jpeg");
                        //for(;c>=0 & c<=5;){
                         //   Logo.setIcon(iconLogo_c);
                        for(int i =0; i < 5; i++) iconLogo[i] = new ImageIcon(file[i]);
                        Logo.setIcon(iconLogo[c%5]);

                        Logo.setIcon(iconLogo[c%5]);
                        c++;
                        //Logo.setOpaque(true);
                        Pan.add(Logo);

                       // Logo.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\bank-1.jpg"));
                        Logo.setOpaque(true);
                        Bar.add(Menu1);
                        Bar.add(Menu2);
                        Bar.add(Menu3);
                        Menu3.add(M7);
                        Menu3.add(M6);
                        Menu2.add(M5);
                        Menu1.add(M1);
                        Menu1.add(M2);
                        Menu1.add(M3);
                        Menu1.add(M4);
                        Menu1.add(M8);
                        Menu1.add(M9);
                        FlowLayout Flow = new FlowLayout();

                        GridLayout Gr = new GridLayout();
                        //Frame.setLayout();
                        F.add(Bar, BorderLayout.NORTH);
                        F.add(Pan, BorderLayout.CENTER);
                        Pan.add(Lab);
                        Pan.add(Logo);
                        Lab.setBackground(Color.RED);
                        //JLabel picLabel = new JLabel(new ImageIcon("C:\\Users\\Admin\\Desktop"));
                        //Pan.add(picLabel, BorderLayout.CENTER);
                        //Pan.setOpaque(false);
                        F.revalidate();

                        M1.addActionListener(
                                new ActionListener() {

                                    public void actionPerformed(ActionEvent e) {
                                        P2.removeAll();

                                       // F.revalidate();
                                        F.remove(Pan);
                                       // Pan.removeAll();
                                        F.remove(P3);
                                        //F.removeAll();
                                        F.repaint();
                                       // F.revalidate();

                                        //JPanel P2 = new JPanel();
                                       // F.repaint();
                                       // F.revalidate();
                                        GridLayout Gr = new GridLayout(6, 3);
                                        JLabel label_1 = new JLabel("Name");
                                        JTextField Text1 = new JTextField();
                                        JLabel label_2 = new JLabel();
                                        JLabel label_3 = new JLabel("Address");
                                        JTextField Text2 = new JTextField();
                                        JLabel label_4 = new JLabel();
                                        JLabel label_5 = new JLabel("Account Type");
                                        JLabel label_9 = new JLabel("Account Number");
                                        label_9.setVisible(false);
                                        JTextField Text3 = new JTextField();
                                        Text3.setVisible(false);
                                        JLabel label_10 = new JLabel();
                                        ButtonGroup Account_Type = new ButtonGroup();
                                        ButtonGroup Gender = new ButtonGroup();
                                        JRadioButton RB1 = new JRadioButton("Current");
                                        JRadioButton RB2 = new JRadioButton("Savings");
                                        JLabel label_6 = new JLabel("Gender");
                                        JRadioButton RB3 = new JRadioButton("Male");
                                        JRadioButton RB4 = new JRadioButton("Female");
                                        JLabel label_7 = new JLabel();
                                        JLabel label_8 = new JLabel();
                                        JButton B1 = new JButton("Create Account");
                                        Account_Type.add(RB1);
                                        Account_Type.add(RB2);
                                        Gender.add(RB3);
                                        Gender.add(RB4);

                                        F.add(P2,BorderLayout.CENTER);
                                        P2.setLayout(Gr);
                                        P2.add(label_1);
                                        P2.add(Text1);
                                        P2.add(label_2);
                                        P2.add(label_3);
                                        P2.add(Text2);
                                        P2.add(label_4);
                                        P2.add(label_5);
                                        P2.add(RB1);
                                        P2.add(RB2);
                                        P2.add(label_6);
                                        P2.add(RB3);
                                        P2.add(RB4);
                                        P2.add(label_9);
                                        P2.add(Text3);
                                        P2.add(label_10);
                                        P2.add(label_7);
                                        P2.add(label_8);
                                        P2.add(B1);
                                        F.revalidate();
                                        F.setSize(500,500);
                                        B1.addActionListener(
                                                new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                            // PreparedStatement Sp = C.prepareStatement("insert into create_user values(?,?,?,?,?,?,?,?,?)");
                                                            String name = Text1.getText();
                                                            String AccType = "";
                                                            String Gender = "";
                                                            String address = Text2.getText();
                                                            if (RB1.isSelected()) {
                                                                AccType = "C";
                                                            }
                                                            if (RB2.isSelected()) {
                                                                AccType = "S";
                                                            }
                                                            if (RB3.isSelected()) {
                                                                Gender = "M";
                                                            }
                                                            if (RB4.isSelected()) {
                                                                Gender = "F";
                                                            }
                                                            if (name.equals("") || address.equals("") || AccType.equals("") || Gender.equals("")){
                                                                JOptionPane.showMessageDialog(null,"Please Enter into all fields!!");
                                                               /* Frame Error = new JFrame("Error");
                                                                JPanel Panel = new JPanel();
                                                                GridLayout Grid = new GridLayout(2,1);
                                                                JButton Ok = new JButton("Ok");
                                                                JLabel Label = new JLabel("Please Enter into all fields to create account!");
                                                                Error.add(Panel);
                                                                Panel.setLayout(Grid);
                                                                Panel.add(Label);
                                                                Panel.add(Ok);
                                                                Error.setSize(300,300);
                                                                Error.setVisible(true);
                                                                Ok.addActionListener(
                                                                        new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                Error.setVisible(false);
                                                                            }
                                                                        }
                                                                );*/

                                                            }
                                                            else {

                                                                //String Password = t2.getText();
                                                                //String Name = t4.getText();
                                                                // Sp.setString(1, "");
                                                                // Sp.setString(2,"");
                                                                // Sp.setString(3,"");
                                                                // Sp.setString(4,"");
                                                                // Sp.setString(5,Email);
                                                                // Sp.setString(6,"");
                                                                // Sp.setString(7,Username);
                                                                // Sp.setString(8,Password);
                                                                // Sp.setString(9,"");

                                                                Statement S = C.createStatement();
                                                                //ResultSet Res;
                                                                // if (AccType =="C") {
                                                                //   ResultSet  Res = S.executeQuery("select Concat('" + AccType + "', '" + Gender + "', LPAD(Ifnull(Max(Substr(Account_Number,3,3))+1,'001'), 3, '0')) from accounts where substr(Account_Number,1,1)='C'||'S'");
                                                                ResultSet Res = S.executeQuery("select Concat('" + AccType + "', '" + Gender + "', LPAD(Ifnull(Max(Substr(Account_Number,3,3))+1,'001'), 3, '0')) from accounts  where substr(Account_Number,1,1)='" + AccType + "'");

                                                                //}
                                                                //if (AccType =="S"){
                                                                //  ResultSet  Res = S.executeQuery("select Concat('" + AccType + "', '" + Gender + "', LPAD(Ifnull(Max(Substr(Account_Number,3,3))+1,'001'), 3, '0')) from accounts where substr(Account_Number,1,1)='S'");
                                                                // }

                                                                Res.next();
                                                                String acc_number = Res.getString(1);
                                                                // if (AccType == "S"){acc_number = Re.getString(1);}

                                                                S.executeUpdate("insert into Accounts values ('" + acc_number + "','" + name + "','" + address + "',now())");
                                                                S.executeUpdate("insert into Accountholders values('" + name + "','" + address + "','','" + acc_number + "','" + username + "','" + password + "', now())");


                                                                //String marks = T3.getText();
                                                                //String query="insert into accuntHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())";
                                                                //System.out.println("insert into accuntHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())");
                                                                //  S.executeUpdate("insert into accountHolders values('"+Name+"','','"+Email+"','','"+Username+"','"+Password+"',now())");
                                                                //S.executeQuery("select * from school");
                                                                Text1.setText("");
                                                                Text2.setText("");
                                                                RB1.setSelected(false);
                                                                RB2.setSelected(false);
                                                                RB3.setSelected(false);
                                                                RB4.setSelected(false);
                                                                label_9.setVisible(true);
                                                                Text3.setVisible(true);
                                                                Text3.setText(acc_number);
                                                            }

                                                            //F.remove(P2);
                                                            //F.revalidate();
                                                            //F.repaint();
                                                            //F.revalidate();
                                                        } catch (Exception V) {
                                                            System.out.println(V.toString());
                                                        }
                                                    }
                                                }
                                        );


                                    }

                                }
                        );

                        M7.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        System.out.println("pressed");


                                        F.remove(P2);
                                        F.remove(Pan);
                                       // Pan.removeAll();
                                        F.remove(P3);
                                        F.repaint();
                                        //JPanel Panel = new JPanel();
                                        //F.invalidate();
                                        for(int i =0; i < 5; i++) iconLogo[i] = new ImageIcon(file[i]);
                                       // Logo.setIcon(iconLogo[c%5]);

                                        Logo.setIcon(iconLogo[c%5]);
                                        c++;

                                        F.add(Pan,BorderLayout.CENTER);
                                        F.revalidate();
                                        F.setSize(500,500);

                                    }
                                }
                        );
                        M8.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        F.remove(Pan);
                                      //  Pan.removeAll();
                                        F.remove(P2);
                                        F.remove(P);
                                        F.repaint();
                                        P3.removeAll();
                                        GridLayout GridL = new GridLayout(9,3);
                                        JLabel label1 = new JLabel();
                                        JLabel label2 = new JLabel();
                                        JLabel label3 = new JLabel();
                                        JLabel label4 = new  JLabel("Account Number");
                                        JTextField textf1 = new JTextField();
                                        JButton butt1 = new JButton("...");
                                        JLabel label5 = new JLabel();
                                        JLabel label6 = new JLabel();
                                        JLabel label7 = new JLabel();
                                        JLabel label8 = new JLabel("Name");
                                        label8.setVisible(false);
                                        JTextField textf2 = new JTextField();
                                        textf2.setVisible(false);
                                        JLabel label9 = new JLabel();
                                        JLabel label10 = new JLabel();
                                        JLabel label11 = new JLabel();
                                        JLabel label12 = new JLabel();
                                        JLabel label13 = new JLabel("Amount");
                                        label13.setVisible(false);
                                        JTextField textf3 = new JTextField();
                                        textf3.setVisible(false);
                                        JLabel label14 = new JLabel();
                                        JLabel label15 = new JLabel();
                                        JLabel label16 = new JLabel();
                                        JLabel label17 = new JLabel();
                                        JLabel label18 = new JLabel("Password");
                                        label18.setVisible(false);
                                        JPasswordField textf4 = new JPasswordField();
                                        textf4.setEchoChar('*');
                                        textf4.setVisible(false);
                                        JLabel label19 = new JLabel();
                                        JLabel label20 = new JLabel();
                                        JLabel label21 = new JLabel();
                                        JButton butt2 = new JButton("Withdraw");
                                        butt2.setVisible(false);
                                        P3.setLayout(GridL);
                                        P3.add(label1);
                                        P3.add(label2);
                                        P3.add(label3);
                                        P3.add(label4);
                                        P3.add(textf1);
                                        P3.add(butt1);
                                        P3.add(label5);
                                        P3.add(label6);
                                        P3.add(label7);
                                        P3.add(label8);
                                        P3.add(textf2);
                                        P3.add(label9);
                                        P3.add(label10);
                                        P3.add(label11);
                                        P3.add(label12);
                                        P3.add(label13);
                                        P3.add(textf3);
                                        P3.add(label14);
                                        P3.add(label15);
                                        P3.add(label16);
                                        P3.add(label17);
                                        P3.add(label18);
                                        P3.add(textf4);
                                        P3.add(label19);
                                        P3.add(label20);
                                        P3.add(label21);
                                        P3.add(butt2);
                                        F.add(P3);
                                        F.revalidate();
                                        F.setSize(500,500);
                                        butt1.addActionListener(
                                                new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                            Statement S = C.createStatement();
                                                            String AccNo = textf1.getText();
                                                            System.out.println(AccNo);
                                                            ResultSet R = S.executeQuery("select * from accounts");
                                                            while (R.next())
                                                            if (AccNo.equals(R.getString("Account_Number"))){
                                                                label8.setVisible(true);
                                                                textf2.setVisible(true);
                                                                textf2.setText(R.getString("Name"));
                                                                label13.setVisible(true);
                                                                textf3.setVisible(true);
                                                                label18.setVisible(true);
                                                                textf4.setVisible(true);
                                                                butt2.setVisible(true);
                                                                String Name = textf2.getText();
                                                                String Amount = textf3.getText();

                                                                butt2.addActionListener(
                                                                        new ActionListener() {
                                                                            @Override
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                try {
                                                                                    Class.forName("com.mysql.jdbc.Driver");
                                                                                    Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                                                    Statement S = C.createStatement();
                                                                                    String AccNo = textf1.getText();
                                                                                    String Name = textf2.getText();
                                                                                    String Amount = textf3.getText();
                                                                                    String PWord = new String(textf4.getPassword());
                                                                                    ResultSet R = S.executeQuery("select * from accounts, withdraw, deposit");
                                                                                    Statement Stat = C.createStatement();
                                                                                    ResultSet Res = Stat.executeQuery("select sum(deposit.amount) as Deposits, sum(withdraw.amount) as Withdrawals from deposit, withdraw where deposit.Account_number ='"+AccNo+"' and withdraw.Account_Number = '"+AccNo+"'");
                                                                                    Res.next();
                                                                                    String Deposits = new String(Integer.toString(Res.getInt(1)));
                                                                                    System.out.println(Deposits);

                                                                                    String Withdrawals = new String(Integer.toString(Res.getInt(2)));
                                                                                    System.out.println(Withdrawals);
                                                                                    boolean test = false;
                                                                                    boolean test2 = false;
                                                                                    while (R.next())
                                                                                        if (PWord.equals(password)){
                                                                                            test = true;
                                                                                            test2 = false;
                                                                                            if (Integer.parseInt(Amount)<(0.8*(Integer.parseInt(Deposits)-Integer.parseInt(Withdrawals)))) {
                                                                                                test2 = true;
                                                                                                S.executeUpdate("insert into withdraw values('"+Name+"','"+username+"','"+AccNo+"',"+Integer.parseInt(Amount)+",now())");
                                                                                                textf1.setText("");
                                                                                                textf2.setText("");
                                                                                                textf3.setText("");
                                                                                                textf4.setText("");
                                                                                                label8.setVisible(false);
                                                                                                textf2.setVisible(false);
                                                                                                label13.setVisible(false);
                                                                                                textf3.setVisible(false);
                                                                                                label18.setVisible(false);
                                                                                                textf4.setVisible(false);
                                                                                                butt2.setVisible(false);
                                                                                            }

                                                                                        }


                                                                                    if(!test) JOptionPane.showMessageDialog(null, "Whoops, incorrect password");
                                                                                    if (!test2){
                                                                                        textf3.setText("");
                                                                                        textf4.setText("");
                                                                                        JOptionPane.showMessageDialog(null,"OH NO!! Not Enough Funds!!");
                                                                                    }





                                                                                } catch (Exception V) {
                                                                                    System.out.println(V.toString());
                                                                                }
                                                                            }
                                                                        }
                                                                );
                                                            }
                                                        }
                                                         catch (Exception V) {
                                                                System.out.println(V.toString());

                                                         }
                                                    }
                                                }
                                        );





                                    }
                                }
                        );

                        M9.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        F.remove(Pan);
                                      //  Pan.removeAll();
                                        F.remove(P2);
                                        F.remove(P);
                                        F.repaint();
                                        P3.removeAll();
                                        GridLayout GridL = new GridLayout(9,3);
                                        JLabel label1 = new JLabel();
                                        JLabel label2 = new JLabel();
                                        JLabel label3 = new JLabel();
                                        JLabel label4 = new  JLabel("Account Number");
                                        JTextField textf1 = new JTextField();
                                        JButton butt1 = new JButton("...");
                                        JLabel label5 = new JLabel();
                                        JLabel label6 = new JLabel();
                                        JLabel label7 = new JLabel();
                                        JLabel label8 = new JLabel("Name");
                                        label8.setVisible(false);
                                        JTextField textf2 = new JTextField();
                                        textf2.setVisible(false);
                                        JLabel label9 = new JLabel();
                                        JLabel label10 = new JLabel();
                                        JLabel label11 = new JLabel();
                                        JLabel label12 = new JLabel();
                                        JLabel label13 = new JLabel("Amount");
                                        label13.setVisible(false);
                                        JTextField textf3 = new JTextField();
                                        textf3.setVisible(false);
                                        JLabel label14 = new JLabel();
                                        JLabel label15 = new JLabel();
                                        JLabel label16 = new JLabel();
                                        JLabel label17 = new JLabel();
                                        JLabel label18 = new JLabel("Password");
                                        label18.setVisible(false);
                                        JPasswordField textf4 = new JPasswordField();
                                        textf4.setEchoChar('*');
                                        textf4.setVisible(false);
                                        JLabel label19 = new JLabel();
                                        JLabel label20 = new JLabel();
                                        JLabel label21 = new JLabel();
                                        JButton butt2 = new JButton("Deposit");
                                        butt2.setVisible(false);
                                        P3.setLayout(GridL);
                                        P3.add(label1);
                                        P3.add(label2);
                                        P3.add(label3);
                                        P3.add(label4);
                                        P3.add(textf1);
                                        P3.add(butt1);
                                        P3.add(label5);
                                        P3.add(label6);
                                        P3.add(label7);
                                        P3.add(label8);
                                        P3.add(textf2);
                                        P3.add(label9);
                                        P3.add(label10);
                                        P3.add(label11);
                                        P3.add(label12);
                                        P3.add(label13);
                                        P3.add(textf3);
                                        P3.add(label14);
                                        P3.add(label15);
                                        P3.add(label16);
                                        P3.add(label17);
                                        P3.add(label18);
                                        P3.add(textf4);
                                        P3.add(label19);
                                        P3.add(label20);
                                        P3.add(label21);
                                        P3.add(butt2);
                                        F.add(P3);
                                        F.revalidate();
                                        F.setSize(500,500);
                                        butt1.addActionListener(
                                                new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                            Statement S = C.createStatement();
                                                            String AccNo = textf1.getText();
                                                            ResultSet R = S.executeQuery("select * from accounts");
                                                            while (R.next())
                                                                if (AccNo.equals(R.getString("Account_Number"))){
                                                                    label8.setVisible(true);
                                                                    textf2.setVisible(true);
                                                                    textf2.setText(R.getString("Name"));
                                                                    label13.setVisible(true);
                                                                    textf3.setVisible(true);
                                                                    label18.setVisible(true);
                                                                    textf4.setVisible(true);
                                                                    butt2.setVisible(true);
                                                                    //String Name = textf2.getText();
                                                                    //String Amount = textf3.getText();
                                                                    butt2.addActionListener(
                                                                            new ActionListener() {
                                                                                @Override
                                                                                public void actionPerformed(ActionEvent e) {
                                                                                    System.out.println("Deposit");
                                                                                    try {
                                                                                        Class.forName("com.mysql.jdbc.Driver");
                                                                                        Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                                                        Statement S = C.createStatement();
                                                                                        String AccNo = textf1.getText();
                                                                                        String Name = textf2.getText();
                                                                                        String Amount = textf3.getText();
                                                                                        String PWord = new String(textf4.getPassword());
                                                                                        ResultSet R = S.executeQuery("select * from accounts");
                                                                                        while (R.next())
                                                                                            if (PWord.equals(password)) {
                                                                                                S.executeUpdate("insert into deposit values('"+Name+"','"+username+"','"+AccNo+"',"+Integer.parseInt(Amount)+",now())");
                                                                                                textf1.setText("");
                                                                                                textf2.setText("");
                                                                                                textf3.setText("");
                                                                                                textf4.setText("");
                                                                                                label8.setVisible(false);
                                                                                                textf2.setVisible(false);
                                                                                                label13.setVisible(false);
                                                                                                textf3.setVisible(false);
                                                                                                label18.setVisible(false);
                                                                                                textf4.setVisible(false);
                                                                                                butt2.setVisible(false);

                                                                                            }
                                                                                    } catch (Exception V) {
                                                                                        System.out.println(V.toString());
                                                                                    }
                                                                                }
                                                                            }
                                                                    );
                                                                }
                                                        }
                                                        catch (Exception V) {
                                                            System.out.println(V.toString());

                                                        }
                                                    }
                                                }
                                        );



                                    }
                                }
                        );

                        M2.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        F.remove(Pan);
                                      //  Pan.removeAll();
                                        F.remove(P2);
                                        F.remove(P);
                                        F.repaint();
                                        P3.removeAll();
                                        GridLayout GridL = new GridLayout(9,3);
                                        JLabel label1 = new JLabel();
                                        JLabel label2 = new JLabel();
                                        JLabel label3 = new JLabel();
                                        JLabel label4 = new  JLabel("Account Number");
                                        JTextField textf1 = new JTextField();
                                        JButton butt1 = new JButton("Get Balance");
                                        JLabel label5 = new JLabel();
                                        JLabel label6 = new JLabel();
                                        JLabel label7 = new JLabel();
                                        JLabel label8 = new JLabel("Name");
                                        label8.setVisible(false);
                                        JTextField textf2 = new JTextField();
                                        textf2.setVisible(false);
                                        JLabel label9 = new JLabel();
                                        JLabel label10 = new JLabel();
                                        JLabel label11 = new JLabel();
                                        JLabel label12 = new JLabel();
                                        JLabel label13 = new JLabel("Current Balance");
                                        label13.setVisible(false);
                                        JTextField textf3 = new JTextField();
                                        textf3.setVisible(false);

                                        JLabel label14 = new JLabel();
                                        JLabel label15 = new JLabel();
                                        JLabel label16 = new JLabel();
                                        JLabel label17 = new JLabel();
                                        JLabel label18 = new JLabel("Password");
                                        //label18.setVisible(false);
                                        JPasswordField textf4 = new JPasswordField();
                                        textf4.setEchoChar('*');
                                        //textf4.setVisible(false);
                                        JLabel label19 = new JLabel();
                                        JLabel label20 = new JLabel();
                                        JLabel label21 = new JLabel();
                                        JLabel label29 = new JLabel();
                                        //JButton butt2 = new JButton("Deposit");
                                        //butt2.setVisible(false);
                                        P3.setLayout(GridL);
                                        P3.add(label1);
                                        P3.add(label2);
                                        P3.add(label3);
                                        P3.add(label4);
                                        P3.add(textf1);
                                        P3.add(label14);
                                        P3.add(label18);
                                        P3.add(textf4);
                                        P3.add(label29);
                                        P3.add(label5);
                                        P3.add(label6);
                                        P3.add(butt1);
                                        //P3.add(label7);
                                        P3.add(label8);
                                        P3.add(textf2);
                                        P3.add(label9);
                                        P3.add(label10);
                                        P3.add(label11);
                                        P3.add(label12);
                                        P3.add(label13);
                                        P3.add(textf3);
                                        //P3.add(label14);
                                        P3.add(label15);
                                        P3.add(label16);
                                        P3.add(label17);
                                        //P3.add(label18);
                                        //P3.add(textf4);
                                        P3.add(label19);
                                        P3.add(label20);
                                        P3.add(label21);
                                       // P3.add(butt2);
                                        F.add(P3);
                                        F.revalidate();
                                        F.setSize(500,500);
                                        butt1.addActionListener(
                                                new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        try {

                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                            Statement S = C.createStatement();
                                                            String AccNo = textf1.getText();
                                                            String pword = new String(textf4.getPassword());
                                                            ResultSet R = S.executeQuery("select * from accounts, withdraw, deposit, accountholders where accountholders.username = '"+username+"'");
                                                            Statement Stat = C.createStatement();
                                                            ResultSet Res = Stat.executeQuery("select sum(deposit.amount) as Deposits, sum(withdraw.amount) as Withdrawals from deposit, withdraw where deposit.Account_number ='"+AccNo+"' and withdraw.Account_Number = '"+AccNo+"'");
                                                            Res.next();
                                                            String Deposits = new String(Integer.toString(Res.getInt(1)));
                                                            System.out.println(Deposits);

                                                            String Withdrawals = new String(Integer.toString(Res.getInt(2)));
                                                            System.out.println(Withdrawals);
                                                            while (R.next())
                                                                if (AccNo.equals(R.getString("Account_Number")) & pword.equals(password)) {
                                                                    label8.setVisible(true);
                                                                    textf2.setVisible(true);
                                                                    textf2.setText(R.getString("Name"));
                                                                    //System.out.println("balance");
                                                                    label13.setVisible(true);
                                                                    textf3.setVisible(true);
                                                                    //System.out.println("Hiiiiii");
                                                                    //ResultSet Res = S.executeQuery("select accounts.account_number, accountholder.name, sum(deposit.amount) as Deposits, sum(withdraw.amount) as Withdrawals from Bank.deposit, bank.withdraw where deposit.Account_number ='"+AccNo+"' & withdraw.Account_Number = '"+AccNo+"'");
                                                                    //System.out.println("Helloooo");
                                                                    //while(Res.next())
                                                                        //System.out.println("Hi there");

                                                                   textf3.setText(Integer.toString((Integer.parseInt(Deposits))-(Integer.parseInt(Withdrawals))));

                                                                    //label18.setVisible(true);
                                                                    //textf4.setVisible(true);
                                                                   // butt2.setVisible(true);
                                                                    //String Name = textf2.getText();
                                                                    //String Amount = textf3.getText();
                                                                }
                                                        }
                                                        catch (Exception V) {
                                                            System.out.println(V.toString());

                                                        }

                                                    }
                                                }
                                        );
                                    }
                                }
                        );

                        M4.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        F.remove(Pan);
                                       // Pan.removeAll();
                                        F.remove(P2);
                                        F.remove(P);
                                        F.repaint();
                                        P3.removeAll();
                                        GridLayout GridL = new GridLayout(13,3);
                                        JLabel label1 = new JLabel();
                                        JLabel label2 = new JLabel();
                                        JLabel label3 = new JLabel();
                                        JLabel label4 = new  JLabel("AccNo of Recipient");
                                        label4.setVisible(false);
                                        JTextField textf1 = new JTextField();
                                        textf1.setVisible(false);
                                        JButton butt1 = new JButton("...");
                                        butt1.setVisible(false);
                                        JLabel label5 = new JLabel();
                                        JLabel label6 = new JLabel();
                                        JLabel label7 = new JLabel();
                                        JLabel label8 = new JLabel("Name");
                                        label8.setVisible(false);
                                        JTextField textf2 = new JTextField();
                                        textf2.setVisible(false);
                                        JLabel label9 = new JLabel();
                                        JLabel label10 = new JLabel();
                                        JLabel label11 = new JLabel();
                                        JLabel label12 = new JLabel();
                                        JLabel label13 = new JLabel("Amount");
                                        label13.setVisible(false);
                                        JTextField textf3 = new JTextField();
                                        textf3.setVisible(false);
                                        JLabel label14 = new JLabel();
                                        JLabel label15 = new JLabel();
                                        JLabel label16 = new JLabel();
                                        JLabel label17 = new JLabel();
                                        JLabel label18 = new JLabel("Password");
                                        label18.setVisible(false);
                                        JPasswordField textf4 = new JPasswordField();
                                        textf4.setEchoChar('*');
                                        textf4.setVisible(false);
                                        JLabel label19 = new JLabel();
                                        JLabel label20 = new JLabel();
                                        JLabel label21 = new JLabel();
                                        JButton butt2 = new JButton("Transfer");
                                        butt2.setVisible(false);
                                        JLabel label22 = new JLabel();
                                        JLabel label23 = new JLabel();
                                        JLabel label24 = new JLabel();
                                        JLabel label25 = new  JLabel("Account Number");
                                        JTextField textf5 = new JTextField();
                                        JButton butt3 = new JButton("...");
                                        JLabel label26 = new JLabel();
                                        JLabel label27 = new JLabel();
                                        JLabel label28 = new JLabel();
                                        JLabel label29 = new JLabel("Name");
                                        label29.setVisible(false);
                                        JTextField textf6 = new JTextField();
                                        textf6.setVisible(false);
                                        JLabel label30 = new JLabel();
                                        P3.setLayout(GridL);
                                        P3.add(label22);
                                        P3.add(label23);
                                        P3.add(label24);
                                        P3.add(label25);
                                        P3.add(textf5);
                                        P3.add(butt3);
                                        P3.add(label26);
                                        P3.add(label27);
                                        P3.add(label28);
                                        P3.add(label29);
                                        P3.add(textf6);
                                        P3.add(label30);
                                        P3.add(label1);
                                        P3.add(label2);
                                        P3.add(label3);
                                        P3.add(label4);
                                        P3.add(textf1);
                                        P3.add(butt1);
                                        P3.add(label5);
                                        P3.add(label6);
                                        P3.add(label7);
                                        P3.add(label8);
                                        P3.add(textf2);
                                        P3.add(label9);
                                        P3.add(label10);
                                        P3.add(label11);
                                        P3.add(label12);
                                        P3.add(label13);
                                        P3.add(textf3);
                                        P3.add(label14);
                                        P3.add(label15);
                                        P3.add(label16);
                                        P3.add(label17);
                                        P3.add(label18);
                                        P3.add(textf4);
                                        P3.add(label19);
                                        P3.add(label20);
                                        P3.add(label21);
                                        P3.add(butt2);
                                        F.add(P3);
                                        F.revalidate();
                                        F.setSize(500,500);
                                        butt3.addActionListener(
                                                new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {
                                                        try {
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                            Statement S = C.createStatement();
                                                            String AccNo = textf5.getText();
                                                            System.out.println(AccNo);
                                                            ResultSet R = S.executeQuery("select * from accounts");
                                                            while (R.next())
                                                                if (AccNo.equals(R.getString("Account_Number"))){
                                                                    label29.setVisible(true);
                                                                    textf6.setVisible(true);
                                                                    textf6.setText(R.getString("Name"));
                                                                    label4.setVisible(true);
                                                                    textf1.setVisible(true);
                                                                    butt1.setVisible(true);
                                                                    butt1.addActionListener(
                                                                            new ActionListener() {
                                                                                @Override
                                                                                public void actionPerformed(ActionEvent e) {
                                                                                    try {
                                                                                        Class.forName("com.mysql.jdbc.Driver");
                                                                                        Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                                                        //Statement S = C.createStatement();
                                                                                        //String AccNo = textf6.getText();
                                                                                        //System.out.println(AccNo);
                                                                                        Statement St = C.createStatement();
                                                                                        ResultSet Res = St.executeQuery("select * from accounts");
                                                                                        String RAccNo = textf1.getText();
                                                                                        System.out.println(RAccNo);
                                                                                        while(Res.next()) {
                                                                                            System.out.println(Res.getString("Account_Number"));
                                                                                            if (RAccNo.equals(Res.getString("Account_Number"))) {
                                                                                                System.out.println("hi");
                                                                                                textf2.setVisible(true);
                                                                                                textf2.setText(Res.getString("Name"));
                                                                                                label8.setVisible(true);
                                                                                                label13.setVisible(true);
                                                                                                textf3.setVisible(true);
                                                                                                label18.setVisible(true);
                                                                                                textf4.setVisible(true);
                                                                                                butt2.setVisible(true);
                                                                                            }
                                                                                        }
                                                                                        //String Name = textf2.getText();
                                                                                        //String Amount = textf3.getText();
                                                                                        butt2.addActionListener(
                                                                                                new ActionListener() {
                                                                                                    @Override
                                                                                                    public void actionPerformed(ActionEvent e) {
                                                                                                        try {
                                                                                                            Class.forName("com.mysql.jdbc.Driver");
                                                                                                            Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                                                                            Statement Sta = C.createStatement();
                                                                                                            String RAccNo = textf1.getText();
                                                                                                            String Name = textf2.getText();
                                                                                                            String MyName = textf6.getText();
                                                                                                            String Amount = textf3.getText();
                                                                                                            String PWord = new String(textf4.getPassword());
                                                                                                            ResultSet Resu = Sta.executeQuery("select * from accounts");
                                                                                                            Statement Stat = C.createStatement();
                                                                                                            ResultSet Res = Stat.executeQuery("select sum(deposit.amount) as Deposits, sum(withdraw.amount) as Withdrawals from deposit, withdraw where deposit.Account_number ='"+AccNo+"' and withdraw.Account_Number = '"+AccNo+"'");
                                                                                                            Res.next();
                                                                                                            String Deposits = new String(Integer.toString(Res.getInt(1)));
                                                                                                            System.out.println(Deposits);

                                                                                                            String Withdrawals = new String(Integer.toString(Res.getInt(2)));
                                                                                                            System.out.println(Withdrawals);
                                                                                                            boolean test = false;
                                                                                                            boolean test2 = false;
                                                                                                            //while (Resu.next()) {
                                                                                                                if (PWord.equals(password)) {
                                                                                                                    test = true;
                                                                                                                    test2 = false;
                                                                                                                    if (Integer.parseInt(Amount)<(0.8*(Integer.parseInt(Deposits)-Integer.parseInt(Withdrawals)))) {
                                                                                                                        test2 = true;
                                                                                                                        S.executeUpdate("insert into deposit values('" + Name + "','" + MyName + "','" + RAccNo + "'," + Float.parseFloat(Amount) + ",now())");
                                                                                                                        S.executeUpdate("insert into withdraw values('" + MyName + "','" + Name + "','" + AccNo + "'," + Float.parseFloat(Amount) + ",now())");
                                                                                                                        textf1.setText("");
                                                                                                                        textf2.setText("");
                                                                                                                        textf3.setText("");
                                                                                                                        textf4.setText("");
                                                                                                                        label8.setVisible(false);
                                                                                                                        textf2.setVisible(false);
                                                                                                                        label13.setVisible(false);
                                                                                                                        textf3.setVisible(false);
                                                                                                                        label18.setVisible(false);
                                                                                                                        textf4.setVisible(false);
                                                                                                                        butt2.setVisible(false);
                                                                                                                        textf2.setText("");
                                                                                                                        label8.setVisible(false);
                                                                                                                        label13.setVisible(false);
                                                                                                                        textf3.setVisible(false);
                                                                                                                        label18.setVisible(false);
                                                                                                                        textf4.setVisible(false);
                                                                                                                        butt2.setVisible(false);
                                                                                                                    }


                                                                                                                }
                                                                                                            if(!test) JOptionPane.showMessageDialog(null, "Whoops, incorrect password");
                                                                                                            if (!test2){
                                                                                                                textf3.setText("");
                                                                                                                textf4.setText("");
                                                                                                                JOptionPane.showMessageDialog(null,"OH NO!! Not Enough Funds!!");
                                                                                                            }



                                                                                                        } catch (Exception V) {
                                                                                                            System.out.println(V.toString());
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                        );


                                                                                    } catch (Exception V) {
                                                                                        System.out.println(V.toString());

                                                                                    }
                                                                                }
                                                                            }
                                                                    );



                                                                }
                                                        }
                                                        catch (Exception V) {
                                                            System.out.println(V.toString());

                                                        }


                                                    }
                                                }
                                        );




                                    }
                                }
                        );

                        M6.addActionListener(
                                new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        F.remove(Pan);
                                      //  Pan.removeAll();
                                        F.remove(P2);
                                        F.remove(P3);
                                        F.remove(P);
                                        F.repaint();

                                        //P3.removeAll();
                                        F.add(P);
                                        F.setVisible(false);
                                        main(args);
                                        //T1.setText("");
                                        //T2.selectAll();
                                       // F.revalidate();
                                    }
                                }
                        );
                       M3.addActionListener(
                               new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       F.remove(Pan);
                                      // Pan.removeAll();
                                       F.remove(P2);
                                       F.remove(P);
                                       F.repaint();
                                       P3.removeAll();
                                       GridLayout GridL = new GridLayout(3,3);
                                       JLabel label1 = new JLabel();
                                       JLabel label2 = new JLabel();
                                       JLabel label3 = new JLabel();
                                       JLabel label4 = new  JLabel("Account Number");
                                       JTextField textf1 = new JTextField();
                                       JButton butt1 = new JButton("...");
                                       JLabel label5 = new JLabel("Deposits");
                                       label5.setVisible(false);
                                       JLabel label6 = new JLabel();
                                       JLabel label7 = new JLabel("Withdrawals");
                                       label7.setVisible(false);
                                       //Scroll.setHorizontalScrollBar(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                                      // JLabel label8 = new JLabel("Name");
                                      // label8.setVisible(false);
                                      // JTextField textf2 = new JTextField();
                                      // textf2.setVisible(false);
                                       JLabel label9 = new JLabel();
                                       JLabel label10 = new JLabel();
                                       JLabel label11 = new JLabel();
                                       JLabel label12 = new JLabel();
                                       JTextArea Deposits = new JTextArea();
                                       Deposits.setVisible(false);
                                       JTextArea Withdrawals = new JTextArea();
                                       JScrollPane Scroll = new JScrollPane(Withdrawals);
                                       JScrollPane Scroll2 = new JScrollPane(Deposits);
                                       Scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Withdrawals.setVisible(false);
                                       Deposits.setLineWrap(true);
                                       Withdrawals.setLineWrap(true);
                                       Deposits.setWrapStyleWord(true);
                                       Withdrawals.setWrapStyleWord(true);
                                       P3.setLayout(GridL);
                                       P3.add(label4);
                                       P3.add(textf1);
                                       P3.add(butt1);
                                       P3.add(label5);
                                       P3.add(label6);
                                       P3.add(label7);

                                       //P3.add(label8);
                                       //P3.add(textf2);
                                       //P3.add(label9);
                                       //P3.add(label10);
                                       //P3.add(label11);
                                       //P3.add(label12);
                                       P3.add(Scroll2);
                                       P3.add(label9);
                                       P3.add(Scroll);
                                       F.add(P3);
                                       F.revalidate();
                                       F.setSize(500,500);
                                       butt1.addActionListener(
                                               new ActionListener() {
                                                   @Override
                                                   public void actionPerformed(ActionEvent e) {
                                                       try {
                                                           ArrayList columnNames = new ArrayList();
                                                           ArrayList data = new ArrayList();

                                                           Class.forName("com.mysql.jdbc.Driver");
                                                           Connection C = DriverManager.getConnection("Jdbc:mysql://localhost/Bank", "root", "");
                                                           Statement S = C.createStatement();
                                                           String AccNo = textf1.getText();
                                                           //ResultSet R = S.executeQuery("select deposit.date as Date, deposit.username as Name, Deposit.amount as Deposits, Withdraw.date as Date, withdraw.username as Name, withdraw.amount as Withdrawals from Bank.Deposit, Bank.Withdraw where deposit.Account_Number ='"+AccNo+"' and withdraw.Account_Number = '"+AccNo+"'");

                                                             //  ResultSetMetaData md = R.getMetaData();
                                                             //  int columns = md.getColumnCount();

                                                             //  for (int i=1; i<= columns ; i++){
                                                             //      columnNames.add(md.getColumnName(i));
                                                             //  }
                                                             //  while (R.next()){
                                                             //      ArrayList row = new ArrayList(columns);

                                                             //      for (int i = 1; i <= columns; i++) {
                                                             //          row.add( R.getObject(i) );
                                                             //      }
                                                             //      data.add(row);


                                                               //}
                                                          // Vector columnNamesVector = new Vector();
                                                          // Vector dataVector = new Vector();

                                                           //for (int i = 0; i < data.size(); i++) {
                                                             //  ArrayList subArray = (ArrayList)data.get(i);
                                                               //Vector subVector = new Vector();

//                                                               for (int j = 0; j < subArray.size(); j++) {
  //                                                                 subVector.add(subArray.get(j));
    //                                                           }
                                                               //dataVector.add(subVector);
      //                                                     }

                                                         //  for (int i = 0; i < columnNames.size(); i++ )
                                                               //columnNamesVector.add(columnNames.get(i));


                                                           PreparedStatement PS = (PreparedStatement) C.prepareStatement("select deposit.date as Date, deposit.username as Name, Deposit.amount as Deposits, Withdraw.date as Date, withdraw.username as Name, withdraw.amount as Withdrawals from Bank.Deposit, Bank.Withdraw where deposit.Account_Number ='"+AccNo+"' and withdraw.Account_Number ='"+AccNo+"'");
                                                           ResultSet R = PS.executeQuery();
                                                           while (R.next()){
                                                               Font Fon = new Font(Font.SERIF,Font.BOLD,14);
                                                               Font Fo = new Font(Font.SERIF,Font.ITALIC,12);
                                                               Deposits.setVisible(true);
                                                               Withdrawals.setVisible(true);
                                                               label5.setVisible(true);
                                                               label7.setVisible(true);
                                                               Deposits.setFont(Fon);
                                                               Withdrawals.setFont(Fo);
                                                               //Deposits.setText(String.valueOf(R));
                                                              Deposits.append("\nDate\n");

                                                               Deposits.append(R.getString(1));
                                                              System.out.println(R.getString(1));
                                                              Deposits.append("\nName\n");
                                                              Deposits.append(R.getString(2));
                                                              System.out.println(R.getString(2));
                                                              Deposits.append(",\nAmount\n");
                                                              Deposits.append(Integer.toString(R.getInt(3)));
                                                               Deposits.append("\n*************\n");
                                                              System.out.println(Integer.toString(R.getInt(3)));
                                                              Withdrawals.append("\nDate\n");
                                                              Withdrawals.append(R.getString(4));
                                                              Withdrawals.append(",\nName\n");
                                                              Withdrawals.append(R.getString(5));
                                                              Withdrawals.append("\nAmount\n");
                                                              Withdrawals.append(Integer.toString(R.getInt(6)));
                                                               Withdrawals.append("\n***********\n");

                                                           }



                                                       }
                                                       catch(Exception V) {
                                                           System.out.println(V.toString());

                                                       }
                                                   }
                                               }
                                       );
                                   }
                               }
                       );

                       M5.addActionListener(
                               new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       F.remove(Pan);
                                       //  Pan.removeAll();
                                       F.remove(P2);
                                       F.remove(P);
                                       F.repaint();
                                       P3.removeAll();
                                       GridLayout GridL = new GridLayout(2,5);
                                       JButton butt1 = new JButton("List of All Accounts");
                                       JButton butt2 = new JButton("List of Male Accounts");
                                       JButton butt3 = new JButton("List of Female Accounts");
                                       JButton butt4 = new JButton("List of Current Accounts");
                                       JButton butt5 = new JButton("List of Savings Accounts");
                                       JTextArea TA1 = new JTextArea();
                                       JTextArea TA2 = new JTextArea();
                                       JTextArea TA3 = new JTextArea();
                                       JTextArea TA4 = new JTextArea();
                                       JTextArea TA5 = new JTextArea();
                                       JScrollPane Scroll1 = new JScrollPane(TA1);
                                       JScrollPane Scroll2 = new JScrollPane(TA2);
                                       JScrollPane Scroll3 = new JScrollPane(TA3);
                                       JScrollPane Scroll4 = new JScrollPane(TA4);
                                       JScrollPane Scroll5 = new JScrollPane(TA5);
                                       Scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Scroll3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Scroll4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       Scroll5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                                       TA1.setVisible(false);
                                       TA1.setLineWrap(true);
                                       TA2.setLineWrap(true);
                                       TA3.setLineWrap(true);
                                       TA4.setLineWrap(true);
                                       TA5.setLineWrap(true);
                                       TA1.setWrapStyleWord(true);
                                       TA2.setWrapStyleWord(true);
                                       TA3.setWrapStyleWord(true);
                                       TA4.setWrapStyleWord(true);
                                       TA5.setWrapStyleWord(true);
                                       P3.setLayout(GridL);
                                       P3.add(butt1);
                                       P3.add(butt2);
                                       P3.add(butt3);
                                       P3.add(butt4);
                                       P3.add(butt5);
                                       P3.add(Scroll1);
                                       P3.add(Scroll2);
                                       P3.add(Scroll3);
                                       P3.add(Scroll4);
                                       P3.add(Scroll5);
                                       F.add(P3);
                                       F.revalidate();
                                       F.setSize(900,700);


                                   }
                               }
                       );

                        //Pan.add(Bar);
                        //Frame.setVisible(true);
                        //Frame.setSize(500,500);
                    }

                    //String marks = T3.getText();
                    //String query="insert into accountHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())";
                    //System.out.println("insert into accountHolders values('','','' ,'','"+Email+"','','"+Username+"','"+Password+"',now())");
                    // S.executeUpdate("insert into accountHolders values('"+Name+"','','"+Email+"','','"+Username+"','"+Password+"',now())");
                    //S.executeQuery("select * from school");

                }
        );

    }
}
