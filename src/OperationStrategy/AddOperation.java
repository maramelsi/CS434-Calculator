package OperationStrategy;

public class AddOperation extends BinaryOperation {
    public AddOperation() {
        super.type = "+";
    }
    @Override
    public String getType(){
        return "+";
    }
    @Override
    public double calculate(String displayText){
   return total += convertToNumber(displayText);
  }

    @Override
    public double calculate(double firstOperand, double secondOperand) {
        return total=(firstOperand + secondOperand);
    }
}
