package CommandPattern;

import FrameFactory.CalculatorGUI;
import ListenersSimpleFactory.OperatorListener;
import OperationStrategy.Operation;

public class ConcreteCommand implements Command{
    private Operation operation;
    private String operand;

    public ConcreteCommand(Operation operation, String operand){
        this.operation = operation;
        this.operand = operand;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
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
        return operation.calculate(operand);
    }

    @Override
    public void unExecute() {

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
