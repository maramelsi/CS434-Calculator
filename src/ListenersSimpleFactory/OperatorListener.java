package ListenersSimpleFactory;

import CommandPattern.CommandHistory;
import OperationStrategy.*;
import SingletonResult.Result;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorListener implements ActionListener {
    Result result = new Result();
    JTextField textField;
    public ArrayList<Operation> operations = new ArrayList<>();
    CommandHistory app = new CommandHistory();

    public OperatorListener(JTextField textField){
        this.textField = textField;
        operations.add(new AddOperation());
        operations.add(new SubstractOperation());
        operations.add(new MultiplyOperation());
        operations.add(new DivideOperation());
        operations.add(new SinOperation());
        operations.add(new CosOperation());
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
        //Maram's code
        for(var operation: operations){
            if(operation.getType().equals(e.getActionCommand())){
                result.setDoubleResult(app.compute(operation, displayText));
            }
        }

        }
    }
