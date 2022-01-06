package OperationStrategy;

public class DivideOperation extends Operation{
  public DivideOperation() {
    super.type = "/";
    super.binary = true;
  }
  @Override
  public double calculate(String displayText) {
    result.setDoubleResult(result.getDoubleResult()/convertToNumber(displayText));
    return result.getDoubleResult();
  }
  @Override
  public double undo(String displayText) {
    result.setDoubleResult(result.getDoubleResult() * convertToNumber(displayText));
    return result.getDoubleResult();
  }
}
