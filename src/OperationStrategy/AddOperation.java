package OperationStrategy;

public class AddOperation extends Operation {
    public AddOperation() {
        super.type = "+";
    }
    double sum =0;
    @Override
    public double calculate(String displayText){
        result.setDoubleResult(result.getDoubleResult() + convertToNumber(displayText));
        sum = result.getDoubleResult();
        return sum;
  }

    /*@Override
    public double calculate(double firstOperand, double secondOperand) {
        result.setDoubleResult(firstOperand + secondOperand);
        return result.getDoubleResult();
    }*/
}
