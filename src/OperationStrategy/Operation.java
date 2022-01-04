package OperationStrategy;

import SingletonResult.Result;

import java.util.ArrayList;

public abstract class Operation {
  protected String type;
  //protected static ArrayList<Operation> operations;
  public Result result = Result.getInstance();
  //constructor
 /* public Operation(){
    operations.add(new AddOperation());
    operations.add(new SubstractOperation());
    operations.add(new MultiplyOperation());
    operations.add(new DivideOperation());
    operations.add(new SinOperation());
    operations.add(new CosOperation());
  }*/
  //getter
  public String getTotalString() {
    return Double.toString(result.getDoubleResult());
  }
  public String getType(){return type;}
  //setter
  public void setTotal(String n) {
    result.setDoubleResult(convertToNumber(n));
  }
  protected double convertToNumber(String n) {
    return Double.parseDouble(n);
  }
  public boolean containsOp(final ArrayList<Operation> list, final String type){
    return list.stream().filter(o->o.getType().equals(type)).findFirst().isPresent();
  }
  public static Operation operationType(ArrayList<Operation> operations, String type){

    for (var operation : operations) {
      if (operation.getType().equals(type)) {
        return operation;
      }
    }
     return null;
  }
  public double calculate(String displayText){return 0.0;}

  public static double calculate(ArrayList<Operation> operations, String type,String displayText) {
    return Operation.operationType(operations, type).calculate(displayText);
  }


}

