package FrameFactory;

import ListenersSimpleFactory.NumberListener;
import ListenersSimpleFactory.OperatorListener;
import OperationStrategy.Operation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CalculatorGUI extends Frame {
    JFrame frame = new JFrame();
    private final Font BIGGER_FONT = new Font("monospaced", Font.PLAIN, 20);
    JPanel pan = new JPanel();
    JPanel panel = new JPanel();
    private boolean number = true;
    private String equalOp = "=";
    JTextField textField = new JTextField("", 12);
    OperatorListener operatorListener = new OperatorListener(textField);
    NumberListener numberListener = new NumberListener(textField);

    @Override
    void create() {

        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(BIGGER_FONT);
        String buttonOrder = "1234567890 ";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));

        //Setting up the numbers Buttons
        for (int i = 0; i < buttonOrder.length(); i++) {
            String key = buttonOrder.substring(i, i + 1);
            if (key.equals(" ")) {
                buttonPanel.add(new JLabel(""));
            } else {
                JButton button = new JButton(key);
                button.addActionListener(numberListener);
                button.setFont(BIGGER_FONT);
                buttonPanel.add(button);
            }
        }
        //Setting up the Operations Buttons
        panel.setLayout(new GridLayout(4, 4, 4, 4));
        String[] opOrder = {"+", "-", "*", "/","=","C","sin","cos","log","e","pi","RES"};
        for (int i = 0; i < opOrder.length; i++) {
            JButton button = new JButton(opOrder[i]);
            //Add Action Listener Here
            button.addActionListener(operatorListener);
            button.setFont(BIGGER_FONT);
            panel.add(button);
        }
        pan.setLayout(new BorderLayout(4, 4));
        pan.add(textField, BorderLayout.NORTH );
        pan.add(buttonPanel , BorderLayout.CENTER);
        pan.add(panel , BorderLayout.EAST);

        frame.setVisible(true);
        frame.setContentPane(pan);
        frame.pack();
        frame.setTitle("Calculator");
        frame.setResizable(false);
    }
}
