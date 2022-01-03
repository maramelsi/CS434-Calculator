package OperationStrategy;

public class CosOperation extends UnaryOperation{
    public CosOperation(){
        super.type = "cos";
    }
    @Override
    public String getType(){
        return "cos";
    }
    @Override
    public double calculate(double firstOperand) {
        return Math.cos(firstOperand);
    }

    @Override
    public double calculate(String displayText) {
        return Math.cos(convertToNumber(displayText));
    }

}
