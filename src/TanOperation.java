import java.util.ArrayList;

public class TanOperation extends Operation{
  public TanOperation(TrigCalculator calc, ArrayList<Double> inputs) {
    this.trig = calc;
    this.inputs = inputs;
  }

  @Override
  double calculate() {
    return 0;
  }
}
