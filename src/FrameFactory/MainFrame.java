package FrameFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {
    FrameFactory frameFactory = new ConcreteFrameFactory();
    JButton buttonCalculator = new JButton("Calculator");
    JButton buttonUnit = new JButton("Unit Conversion");

    JFrame frame = new JFrame("Choose :");
    public MainFrame(){
        showGUI();
        buttonAction();
    }
    private void buttonAction() {
        // creates instance of JButton
        buttonCalculator.setBounds(0, 150, 200, 100);
        buttonUnit.setBounds(300, 150, 200,100);
        // adds button in JFrame
        frame.add(buttonCalculator);
        frame.add(buttonUnit);
        buttonCalculator.addActionListener(this);
        buttonUnit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonCalculator)
            frameFactory.createFrame("calculator");
        if(e.getSource() == buttonUnit)
            frameFactory.createFrame("unit");
    }
    public void showGUI(){
        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // sets 500 width and 600 height
        frame.setSize(500, 500);
        // uses no layout managers
        frame.setLayout(null);
        // makes the frame visible
        frame.setVisible(true);
    }
}
