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
        return Operation.undo(operation, operand);
    }

}
