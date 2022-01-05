package CommandPattern;

import OperationStrategy.Operation;

public class ConcreteCommand implements Command{
    private String operation;
    private final String operand;

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
