package OperationStrategy;

public abstract class UnaryOperation extends Operation {

    public String getName(){
        return "unary";
    }
    public abstract double calculate(double firstOperand);
}
