package FrameFactory;

import javax.swing.*;

public class CalculatorGUI extends Frame {
    @Override
    public void create(){
        JFrame frame = new Calculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
