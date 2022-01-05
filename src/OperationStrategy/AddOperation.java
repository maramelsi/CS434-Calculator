package OperationStrategy;

public class AddOperation extends Operation {
    public AddOperation() {
        super.type = "+";
    }
    double sum =0;
    @Override
    public double calculate(String displayText){
        sum = result.getDoubleResult() + convertToNumber(displayText);
        result.setDoubleResult(sum);
        System.out.println("ADD");
        //System.out.println(result.getDoubleResult());

        return result.getDoubleResult();
  }

    /*@Override
    public double calculate(double firstOperand, double secondOperand) {
        result.setDoubleResult(firstOperand + secondOperand);
        return result.getDoubleResult();
    }*/
}
