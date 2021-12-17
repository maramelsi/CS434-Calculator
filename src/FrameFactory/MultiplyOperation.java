package FrameFactory;

import java.util.ArrayList;

public class MultiplyOperation extends Operation{
  public MultiplyOperation() {
    super.type = "*";
  }

  @Override
  double calculate(String displayText) {
    total *= convertToNumber(displayText);
    return total;
  }
}
