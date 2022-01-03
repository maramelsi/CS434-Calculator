package FrameFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConversionGUI extends Frame {
    JFrame frame ;
    JPanel contentPane;

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

        JButton btnW = new JButton("Temperature");
        btnW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add some Converting Functionalities

            }
        });
        btnW.setBackground(Color.GRAY);
        btnW.setForeground(Color.WHITE);
        btnW.setBounds(100, 100, 250, 50);
        contentPane.add(btnW);
    }
}
