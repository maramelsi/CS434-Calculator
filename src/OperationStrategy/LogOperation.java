package OperationStrategy;

import SingletonResult.Result;

public class LogOperation extends Operation{
    public LogOperation() {
        super.type = "log";
    }

    @Override
    public double calculate(String displayText) {
        result.setDoubleResult(Math.log(convertToNumber(displayText)));
        return result.getDoubleResult();
    }
}