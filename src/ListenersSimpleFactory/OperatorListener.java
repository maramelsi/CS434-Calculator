package ListenersSimpleFactory;

import CommandPattern.CommandHistory;
import OperationStrategy.*;
import SingletonResult.Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorListener implements ActionListener {
    Result result = Result.getInstance();
    JTextField textField;
    CommandHistory app = new CommandHistory();
    private boolean number = true;
    private String equalOp = "=";

    public OperatorListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = textField.getText();

                if (e.getActionCommand().equals("=")) {
                   if (number && (!equalOp.equals("="))) {
                       app.compute(equalOp, displayText);
                   }
                    textField.setText("" + result.getDoubleResult());
                    System.out.println(result.getDoubleResult());
                }
                else {
                    result.setDoubleResult(Double.parseDouble(textField.getText()));
                    if(OperationList.isBinary(e.getActionCommand())){
                        equalOp = e.getActionCommand();
                        number = true;
                        result.setDoubleResult(Double.parseDouble(textField.getText()));
                    }
                    else {
                        number = false;
                        app.compute(e.getActionCommand(), displayText);
                    }
                    textField.setText("");
                    System.out.println(result.getDoubleResult());
                }

            }

}
