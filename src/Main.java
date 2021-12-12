import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        CalculatorFactory factory = new CalculatorFactory();
        //Create an arithmetic calculator
        ICalculator calc1 = factory.createCalculator(CalculatorFactory.CalcType.ARITHMETIC);
        ICalculator calc2 = factory.createCalculator(CalculatorFactory.CalcType.TRIG);
        ArrayList<Double> operands = new ArrayList<>();
        operands.add(1.0);
        operands.add(3.0);
        Operation add = new AddOperation((ArithmeticCalculator) calc1, operands);
        Operation sin = new SinOperation((TrigCalculator) calc2, operands);
        System.out.println(add.calculate());
    }
}
