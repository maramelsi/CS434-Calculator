import java.util.ArrayList;

public abstract class Operation {

  protected ArithmeticCalculator arithmetic;
  protected TrigCalculator trig;
  ArrayList<Double> inputs = new ArrayList<>();

  abstract double calculate();
}

