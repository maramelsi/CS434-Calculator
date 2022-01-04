package OperationStrategy;

public class SubstractOperation extends Operation{
  public SubstractOperation() {
    super.type = "-";
  }

  @Override
  public double calculate(String displayText) {
    result.setDoubleResult(result.getDoubleResult()-convertToNumber(displayText));
    return result.getDoubleResult();
  }

  /*@Override
  public double calculate(double firstOperand, double secondOperand) {
    result.setDoubleResult(firstOperand-secondOperand);
    return result.getDoubleResult();
  }*/
}
