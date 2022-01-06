package OperationStrategy;

public class COperation extends Operation{
    public COperation() {
        super.type = "C";
        super.binary = false;
    }

    @Override
    public double calculate(String displayText) {
       result.clearResult();
        return result.getDoubleResult();
    }
    @Override
    public double undo(String displayText) {
        result.setDoubleResult(convertToNumber(displayText));
        return result.getDoubleResult();
    }
}
