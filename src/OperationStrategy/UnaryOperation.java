package OperationStrategy;

public abstract class UnaryOperation extends Operation {
    public UnaryOperation(){
        super.name = "unary";
    }
    @Override
    public String getName(){
        return "unary";
    }
    public abstract double calculate(double firstOperand);
}
