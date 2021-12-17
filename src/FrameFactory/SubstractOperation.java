package FrameFactory;

public class SubstractOperation extends Operation{
  public SubstractOperation() {
    super.type = "-";
  }

  @Override
  double calculate(String displayText) {
    total -= convertToNumber(displayText);
    return total;
  }
}
