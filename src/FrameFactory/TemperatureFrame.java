package FrameFactory;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureFrame extends Frame{
    JFrame frame = new JFrame();
    private final JPanel contentPane = new JPanel();
    private JTextField Celsius;
    private JTextField Fahrenheit;
    private JTextField toFOutput;
    @Override
    void create() {
        frame.setBounds(100, 100, 500, 600);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        contentPane.setForeground(Color.WHITE);
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        Celsius = new JTextField();
        Celsius.setForeground(Color.black);
        Celsius.setFont(new Font("Tacoma", Font.BOLD, 20));
        Celsius.setHorizontalAlignment(SwingConstants.CENTER);
        Celsius.setBounds(48, 94, 200, 50);
        contentPane.add(Celsius);
        Celsius.setColumns(10);

        Fahrenheit = new JTextField();
        Fahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
        Fahrenheit.setForeground(Color.black);
        Fahrenheit.setFont(new Font("Tacoma", Font.BOLD, 20));
        Fahrenheit.setColumns(10);
        Fahrenheit.setBounds(48, 330, 200, 50);
        contentPane.add(Fahrenheit);

        JLabel CelLabel = new JLabel("\u00B0c ");
        CelLabel.setFont(new Font("Tacoma", Font.BOLD, 30));
        CelLabel.setForeground(Color.WHITE);
        CelLabel.setBounds(260, 94, 59, 46);
        contentPane.add(CelLabel);

        JLabel FehLabel = new JLabel("\u00B0F");
        FehLabel.setForeground(Color.WHITE);
        FehLabel.setFont(new Font("Tacoma", Font.BOLD, 30));
        FehLabel.setBounds(260, 327, 59, 46);
        contentPane.add(FehLabel);


        JButton btnC = new JButton("Convert");
        //addListener
        btnC.addActionListener(e -> {
            if(Celsius.getText().isEmpty())
            {
                toFOutput.setText("Please  Check your input");
            }
            else
            {
                //toFOutput.setText(null);
                double cel = Double.parseDouble(Celsius.getText());
                double fa = cel * 1.8 +32;
                String far = String.format("%.2f",fa);
                Fahrenheit.setText(far);
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
            if(Fahrenheit.getText().isEmpty())
            {
                toFOutput.setText("Please  Check your input");
            }
            else
            {
                //toFOutput.setText(null);
                double far = Double.parseDouble(Fahrenheit.getText());
                double ce = far -32 /1.8 ;
                String cel = String.format("%.2f", ce);
                Celsius.setText(cel);
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
