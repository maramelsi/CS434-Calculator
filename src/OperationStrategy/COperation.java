package OperationStrategy;

public class COperation extends Operation{
    public COperation() {
        super.type = "C";
    }

    @Override
    public double calculate(String displayText) {
       result.clearResult();
        return result.getDoubleResult();
    }
}
