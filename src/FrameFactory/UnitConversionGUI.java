package FrameFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConversionGUI extends Frame implements ActionListener {
    JFrame frame ;
    JPanel contentPane;
    JButton temperatureButton = new JButton("Temperature");
    JButton lengthButton = new JButton("Length");
    FrameFactory frameFactory = new ConcreteFrameFactory();
    @Override
    void create() {
    frame =new JFrame();
    frame.setBounds(100, 100, 500, 600);
    contentPane = new JPanel();
    contentPane.setBorder(UIManager.getBorder("Button.border"));
    frame.setContentPane(contentPane);
    contentPane.setLayout(null);
    frame.setVisible(true);
        JLabel converter = new JLabel("Unit Converter");
        converter.setForeground(Color.black);
        converter.setHorizontalAlignment(SwingConstants.CENTER);
        converter.setBounds(12, 13, 441, 79);
        contentPane.add(converter);
        temperatureButton.addActionListener(this);
        temperatureButton.setBackground(Color.GRAY);
        temperatureButton.setForeground(Color.WHITE);
        temperatureButton.setBounds(100, 100, 250, 50);
        contentPane.add(temperatureButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == temperatureButton)
            frameFactory.createFrame("temp");
        if(e.getSource() == lengthButton)
            frameFactory.createFrame("length");
    }
}
