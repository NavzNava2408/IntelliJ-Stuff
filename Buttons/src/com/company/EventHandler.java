package com.company;
import java.awt.*;
import java.awt.event.*;

public class EventHandler implements ActionListener {
    TextField T1, T2, T3;
    Button BA, BS, BM, BD;

    public EventHandler(TextField t1, TextField t2, TextField t3, Button b1, Button b2, Button b3, Button b4){
        T1 = t1;
        T2 = t2;
        T3 = t3;
        BA = b1;
        BS = b2;
        BM = b3;
        BD = b4;
    }
    public void actionPerformed(ActionEvent x){
        float No1, No2, No3=0;
        Button Btn;
        No1 = Integer.parseInt(T1.getText());
        No2 = Integer.parseInt(T2.getText());
        Btn = (Button) x.getSource();
        if (Btn == BA){
            No3 = No1 + No2;
        }
        if(Btn==BS){
            No3 = No1 - No2;
        }
        if (Btn==BM){
            No3 = No1*No2;
        }
        if (Btn==BD){
            No3=No1/No2;
        }
        T3.setText(Float.toString(No3));
    }

}
