package OperationStrategy;

import java.util.ArrayList;

public abstract class Operation {
  protected String name;
  protected String type;
  protected double total;
  public Operation() {
    if(type.equals("*")|| type.equals("/"))
    total = 1;
    else total = 0;
  }
  //getter
  public String getTotalString() {
    return Double.toString(total);
  }
  public abstract String getType();
  public abstract String getName();
  //setter
  public void setTotal(String n) {
    total = convertToNumber(n);
  }
  protected double convertToNumber(String n) {
    return Double.parseDouble(n);
  }
  public boolean containsOp(final ArrayList<Operation> list, final String type){
    return list.stream().filter(o->o.getType().equals(type)).findFirst().isPresent();
  }


  public abstract double calculate(String displayText);
}

