import java.util.ArrayList;

public class SinOperation extends Operation{
  public SinOperation(TrigCalculator calc, ArrayList<Double> inputs) {
    this.trig = calc;
    this.inputs = inputs;
  }

  @Override
  double calculate() {
    return 0;
  }
}
