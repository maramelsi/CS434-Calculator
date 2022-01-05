package OperationStrategy;

import ListenersSimpleFactory.OperatorListener;

public class AddOperation extends Operation {
    public AddOperation() {
        super.type = "+";
        super.binary = true;
    }

    @Override
    public double calculate(String displayText){
        result.setDoubleResult(result.getDoubleResult() + convertToNumber(displayText));
        System.out.println("ADD");
        //System.out.println(result.getDoubleResult());

        return result.getDoubleResult();
  }

    /*@Override
    public double calculate(double firstOperand, double secondOperand) {
        result.setDoubleResult(firstOperand + secondOperand);
        return result.getDoubleResult();
    }*/
}
