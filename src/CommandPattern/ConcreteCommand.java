package CommandPattern;

import FrameFactory.CalculatorGUI;
import ListenersSimpleFactory.OperatorListener;
import OperationStrategy.Operation;

import java.util.ArrayList;

public class ConcreteCommand implements Command{
    private String operation;
    private String operand;

    public ConcreteCommand(String operation, String operand){
        this.operation = operation;
        this.operand = operand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    @Override
    public double execute() {
        return Operation.calculate(operation, operand);
    }

    @Override
    public double unExecute() {
        return Operation.calculate(undo(operation), operand);
    }
    public String undo(String operator){
        String undo;
        switch (operator) {
            case "+":
                undo = "-";
                break;
            case "-":
                undo = "+";
                break;
            case "*":
                undo = "/";
                break;
            case "/":
                undo = "*";
                break;
            default:
                undo = " ";
                break;
        }
        return undo;

    }
}
