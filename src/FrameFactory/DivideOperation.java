package FrameFactory;

public class DivideOperation extends Operation{
  public DivideOperation() {
    super.type = "/";
  }

  @Override
  double calculate(String displayText) {
    total /= convertToNumber(displayText);
    return total;
  }
}
