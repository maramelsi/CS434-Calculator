package ListenersSimpleFactory;

import CommandPattern.CommandHistory;
import OperationStrategy.*;
import SingletonResult.Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorListener implements ActionListener {
    Result result = Result.getInstance();
    JTextField textField;
    CommandHistory app = new CommandHistory();
    private boolean number = true;
    private String equal = "=";

    public OperatorListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = textField.getText();
        if (e.getActionCommand().equals("=")) {
            // result.setDoubleResult(Math.sin(Double.valueOf(displayText).doubleValue()));
            textField.setText("" + result.getDoubleResult());
        }
        else {
            app.compute(e.getActionCommand(), displayText);
            textField.setText("" + result.getDoubleResult());
        }
         /*   if(result.getBool()){
            result.setBool(true);
            textField.setText("");
            result.setDoubleResult(0);
        }
*/
        }
        //Helper function
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    private void action() {
        number = true;
        //?? set empty text every time the action command is performed
        //textfield.setText("");
        equal = "=";
        //Set result to empty
        result.setDoubleResult(0);
    }

}
