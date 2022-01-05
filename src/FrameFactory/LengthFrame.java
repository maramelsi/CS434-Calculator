package FrameFactory;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LengthFrame extends Frame{
    JFrame frame = new JFrame();
    private final JPanel contentPane = new JPanel();
    private JTextField meter;
    private JTextField Cm;
    private JTextField toFOutput;
    @Override
    void create() {
        frame.setBounds(100, 100, 500, 600);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        meter = new JTextField();
        meter.setForeground(Color.black);
        meter.setFont(new Font("Tacoma", Font.BOLD, 20));
        meter.setHorizontalAlignment(SwingConstants.CENTER);
        meter.setBounds(48, 94, 200, 50);
        contentPane.add(meter);
        meter.setColumns(10);

        Cm = new JTextField();
        Cm.setHorizontalAlignment(SwingConstants.CENTER);
        Cm.setForeground(Color.black);
        Cm.setFont(new Font("Tacoma", Font.BOLD, 20));
        Cm.setColumns(10);
        Cm.setBounds(48, 330, 200, 50);
        contentPane.add(Cm);

        JLabel CelLabel = new JLabel("Meter ");
        CelLabel.setFont(new Font("Tacoma", Font.BOLD, 30));
        CelLabel.setForeground(Color.WHITE);
        CelLabel.setBounds(260, 94, 59, 46);
        contentPane.add(CelLabel);

        JLabel FehLabel = new JLabel("CM");
        FehLabel.setForeground(Color.WHITE);
        FehLabel.setFont(new Font("Tacoma", Font.BOLD, 30));
        FehLabel.setBounds(260, 327, 59, 46);
        contentPane.add(FehLabel);


        JButton btnC = new JButton("Convert");
        //addListener
        btnC.addActionListener(e -> {
            if(meter.getText().isEmpty())
            {
                toFOutput.setText("Please  Check your input");
            }
            else
            {
                //toFOutput.setText(null);
                double cel = Double.parseDouble(meter.getText());
                double fa = cel * 100 ;
                String far = String.valueOf(fa);
                Cm.setText(far);
            }
        });
        btnC.setForeground(new Color(255, 255, 0));
        btnC.setBackground(new Color(25, 25, 112));
        btnC.setFont(new Font("Tacoma", Font.PLAIN, 18));
        btnC.setBounds(318, 94, 100, 50);
        contentPane.add(btnC);

        JButton btnF = new JButton("Convert");
        //Add Listener
        btnF.addActionListener(e -> {
            if(Cm.getText().isEmpty())
            {
                toFOutput.setText("Please  Check your input");
            }
            else
            {
                //toFOutput.setText(null);
                double far = Double.parseDouble(Cm.getText());
                double ce = far /100 ;
                String cel = String.valueOf(ce);
                meter.setText(cel);
            }
        });
        btnF.setForeground(Color.YELLOW);
        btnF.setFont(new Font("Tacoma", Font.PLAIN, 18));
        btnF.setBackground(new Color(25, 25, 112));
        btnF.setBounds(318, 330, 100, 50);
        contentPane.add(btnF);

        contentPane.setVisible(true);
        frame.add(contentPane);
        frame.setContentPane(contentPane);
        frame.setVisible(true);
        frame.pack();
    }
}
