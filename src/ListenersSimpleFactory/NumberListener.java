package ListenersSimpleFactory;

import SingletonResult.Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberListener implements ActionListener {
    JTextField textField ;
    boolean isNumber = true;
    Result result = Result.getInstance();
    public NumberListener(JTextField textfield){
        this.textField = textfield;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String digit = e.getActionCommand();
        if (isNumber) {
            textField.setText(digit);
            isNumber = false;
            result.setBool(false);
        }
        else {
            textField.setText(textField.getText()+digit);

        }
    }
}
