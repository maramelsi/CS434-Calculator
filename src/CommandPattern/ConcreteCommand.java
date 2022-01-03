package CommandPattern;

import FrameFactory.CalculatorGUI;
import ListenersSimpleFactory.OperatorListener;
import OperationStrategy.Operation;

public class ConcreteCommand implements Command{
    private OperatorListener calculator;
    private Operation operation;
    private String operand;

    public ConcreteCommand(OperatorListener calculator, Operation operation, String operand){
        this.calculator = calculator;
        this.operation = operation;
        this.operand = operand;
    }

    public OperatorListener getCalculator() {
        return calculator;
    }

    public void setCalculator(OperatorListener calculator) {
        this.calculator = calculator;
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
        for(var opr: calculator.operations){
            if(opr.getType().equals(operation.getType())){
               return opr.calculate(operand);
            }
        }
        return 0;
    }

    @Override
    public void unExecute() {
        for(var opr: calculator.operations){
            if(opr.getType().equals(undo(operation.getType()))){
                opr.undo();


            }
        }
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
