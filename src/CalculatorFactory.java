public class CalculatorFactory {
    public ICalculator createCalculator(CalcType type){
        if(type.equals(CalcType.ARITHMETIC))
            return new ArithmeticCalculator();
        else if(type.equals(CalcType.TRIG))
            return new TrigCalculator();
        else
            return () -> System.out.println("Invalid type specified");
    }

    public enum CalcType {
        ARITHMETIC, TRIG
    }
}
