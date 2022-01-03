package ListenersSimpleFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberListener implements ActionListener {
    JTextField textField;
    public NumberListener(JTextField textfield){
        this.textField = textfield;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String digit = e.getActionCommand();
            textField.setText(digit);
    }
}
