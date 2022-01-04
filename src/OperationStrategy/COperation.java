package OperationStrategy;

public class COperation extends Operation{
    public COperation() {
        super.type = "C";
    }

    @Override
    public double calculate(String displayText) {
        result.setDoubleResult(0);
        return result.getDoubleResult();
    }
}
