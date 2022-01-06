package OperationStrategy;

import OperationStrategy.Operation;

public class MultiplyOperation extends Operation {
  public MultiplyOperation() {
    super.type = "*";
    super.binary = true;
  }

  @Override
  public double calculate(String displayText) {
    result.setDoubleResult(result.getDoubleResult() * convertToNumber(displayText));
    return result.getDoubleResult();
  }

  @Override
  public double undo(String displayText) {
    result.setDoubleResult(result.getDoubleResult() / convertToNumber(displayText));
    return result.getDoubleResult();
  }
}
