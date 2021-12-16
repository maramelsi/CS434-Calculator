package FrameFactory;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Unit extends JFrame {

    private JPanel contentPane;

    //create Frame
    public Unit() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPane = new JPanel();
        contentPane.setBorder(UIManager.getBorder("Button.border"));
        setContentPane(contentPane);
        contentPane.setLayout(null);

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
