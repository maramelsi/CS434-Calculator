package OperationStrategy;

public class SinOperation extends UnaryOperation {
    public SinOperation(){
        super.type = "sin";
    }
    @Override
    public String getType(){
        return "sin";
    }
    @Override
    public double calculate(double firstOperand) {
        return Math.sin(firstOperand);
    }

    @Override
    public double calculate(String displayText) {
        return Math.sin(convertToNumber(displayText));
    }
}
