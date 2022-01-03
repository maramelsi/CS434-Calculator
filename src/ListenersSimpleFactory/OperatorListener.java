package ListenersSimpleFactory;

import SingletonResult.Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorListener implements ActionListener {
    Result result = new Result();
    JTextField textField;

    public OperatorListener(JTextField textField){
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = textField.getText();
        if (e.getActionCommand().equals("sin")){
            result.setDoubleResult(Math.sin(Double.valueOf(displayText).doubleValue()));
            textField.setText("" + result.getDoubleResult());
        }else if (e.getActionCommand().equals("cos"))
        {
            result.setDoubleResult(Math.cos(Double.valueOf(displayText).doubleValue()));
            textField.setText("" + result.getDoubleResult());
        }
        else if (e.getActionCommand().equals("log"))
        {
            result.setDoubleResult(Math.log(Double.valueOf(displayText).doubleValue()));
            textField.setText("" + result.getDoubleResult());
        }
        else if (e.getActionCommand().equals("C"))
        {
            result.setDoubleResult(0);
        }
        }
    }
