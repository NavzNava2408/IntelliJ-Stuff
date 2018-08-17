package com.company;
import java.awt.*;
import java.awt.event.*;
public class ClosingHandler extends WindowAdapter {
    Frame F;
    public ClosingHandler(Frame f){
        F=f;
    }
    public void windowClosing(WindowEvent e) {
        F.setVisible(false);
    }
}
