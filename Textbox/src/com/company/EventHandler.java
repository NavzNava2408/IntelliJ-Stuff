package com.company;
import java.awt.event.*;
import java.awt.TextField;
public class EventHandler implements ActionListener{
    TextField txt;
    public EventHandler(TextField t){
        txt=t;
    }
    public void actionPerformed(ActionEvent A){
        txt.setText("Hola!!");
    }
}

class EventA implements ActionListener{
    TextField txt;
    public EventA(TextField t2){
        txt=t2;
    }
    public void actionPerformed(ActionEvent A){
        txt.setText("Bonjour!!");
    }
}