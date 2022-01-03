package OperationStrategy;

public abstract class BinaryOperation extends Operation {
    public BinaryOperation(){
        super.name = "binary";
    }
    @Override
    public String getName(){
        return "binary";
    }
    public abstract double calculate(double firstOperand, double secondOperand);
}
