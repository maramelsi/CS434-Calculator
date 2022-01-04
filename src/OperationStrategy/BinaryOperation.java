package OperationStrategy;

public abstract class BinaryOperation extends Operation {

    public String getName(){
        return "binary";
    }
    public abstract double calculate(double firstOperand, double secondOperand);
}
