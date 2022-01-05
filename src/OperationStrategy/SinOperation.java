package OperationStrategy;

public class SinOperation extends Operation {
    public SinOperation() {
        super.type = "sin";
        super.binary = false;
    }
/*@Override
    public double calculate(double firstOperand) {
        result.setDoubleResult(Math.sin(firstOperand));
        return result.getDoubleResult();
    }*/

    @Override
    public double calculate(String displayText) {
        result.setDoubleResult(Math.sin(convertToNumber(displayText)));
        return result.getDoubleResult();
    }
}
