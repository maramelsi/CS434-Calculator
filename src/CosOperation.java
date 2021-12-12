import java.util.ArrayList;

public class CosOperation extends Operation{
  public CosOperation(TrigCalculator calc, ArrayList<Double> inputs) {
    this.trig = calc;
    this.inputs = inputs;
  }

  @Override
  double calculate() {
    return 0;
  }
}
