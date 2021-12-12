import java.util.ArrayList;

public class MultiplyOperation extends Operation{

  public MultiplyOperation(ArithmeticCalculator calc, ArrayList<Double> inputs) {
    this.arithmetic = calc;
    this.inputs = inputs;
  }

  @Override
  public double calculate() {
  return (inputs.get(0)*inputs.get(1));
  }
}
