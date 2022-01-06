package OperationStrategy;

import ListenersSimpleFactory.OperatorListener;

public class CosOperation extends Operation {
    public CosOperation() {
        super.type = "cos";
        super.binary = false;
    }

    @Override
    public double calculate(String displayText) {
        result.setDoubleResult(Math.cos(convertToNumber(displayText)));
        return result.getDoubleResult();
    }
    @Override
    public double undo(String displayText) {
        return result.getDoubleResult();
    }

}
