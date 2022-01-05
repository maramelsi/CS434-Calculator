package OperationStrategy;

import SingletonResult.Result;

public abstract class Operation {
  static OperationList operations = OperationList.getInstance();
  protected String type;
  public Result result = Result.getInstance();

  public String getType(){return type;}

  protected double convertToNumber(String n) {
    return Double.parseDouble(n);
  }

  public abstract double calculate(String displayText);

  public static double calculate(String type,String displayText) {
    return OperationList.operationType(type).calculate(displayText);
  }

}

