import java.util.ArrayList;

public class DivideOperation extends Operation{

  public DivideOperation(ArithmeticCalculator calc, ArrayList<Double> inputs) {
    this.arithmetic = calc;
    this.inputs = inputs;
  }

  @Override
  public double calculate() {
    return (inputs.get(0)/inputs.get(1));
  }
}
