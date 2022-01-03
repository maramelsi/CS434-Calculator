package OperationStrategy;

import OperationStrategy.Operation;

public class MultiplyOperation extends BinaryOperation {
  public MultiplyOperation() {
    super.type = "*";
  }
  @Override
  public String getType(){
    return "*";
  }
  @Override
  public double calculate(String displayText) {
    total *= convertToNumber(displayText);
    return total;
  }

  @Override
  public double calculate(double firstOperand, double secondOperand) {
    return total=(firstOperand*secondOperand);
  }
}
