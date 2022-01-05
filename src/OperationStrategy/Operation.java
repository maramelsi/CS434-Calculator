package OperationStrategy;

import SingletonResult.Result;

public abstract class Operation {
  static OperationList operations = OperationList.getInstance();
  protected String type;
  public Result result = Result.getInstance();
  protected Boolean binary = false;

  public  Boolean getBinary(){
    return this.binary;
  }
  public String getType(){return type;}

  protected double convertToNumber(String n) {
    return Double.parseDouble(n);
  }

  public abstract double calculate(String displayText);

  public static double calculate(String type,String displayText) {
    return operations.operationType(type).calculate(displayText);
  }

}

