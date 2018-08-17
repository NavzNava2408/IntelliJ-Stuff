package com.company;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float c=0, d, e;
        Frame F = new Frame("FUNTIME!!");
        FlowLayout Fl = new FlowLayout();
        F.setLayout(Fl);
        F.setSize(500,500);
        F.setVisible(true);
        for(c=0;c<=250;c++){
            for(d=0;d<=250;d++){
                for(e=0;e<=250;e++){
                    F.setBackground(Color.getHSBColor(c,d,e));
                }
            }
        }


    }
}
