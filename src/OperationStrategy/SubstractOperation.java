package OperationStrategy;

public class SubstractOperation extends Operation{
  public SubstractOperation() {
    super.type = "-";
    super.binary = true;
  }
  double sum =0;
  @Override
  public double calculate(String displayText) {
   sum = result.getDoubleResult() - convertToNumber(displayText);
    result.setDoubleResult(sum);
    System.out.println("SUb");
   // System.out.println(result.getDoubleResult());

    return result.getDoubleResult();
  }
    @Override
    public double undo(String displayText) {
        result.setDoubleResult(result.getDoubleResult() + convertToNumber(displayText));
        return result.getDoubleResult();
    }
}
