package ListenersSimpleFactory;

import CommandPattern.CommandHistory;
import SingletonResult.Result;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OperatorListener implements ActionListener {
    Result result = Result.getInstance();
    JTextField textField;
    CommandHistory app = new CommandHistory();

    public OperatorListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = textField.getText();
                if (e.getActionCommand().equals("=")) {
                    result.setDoubleResult(Double.parseDouble(displayText));
                    // textField.setText("TEST");
                } else {
                    app.compute(e.getActionCommand(), displayText);
                }
        System.out.println(result.getDoubleResult());
        textField.setText("" + result.getDoubleResult());
            }

}
