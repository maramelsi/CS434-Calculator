package FrameFactory;

import java.util.ArrayList;

public abstract class Operation {
  protected String type;
  protected double total;
  public Operation() {
    type = "";
    total = 0;
  }
  //getter
  public String getTotalString() {
    return ""+total;
  }
  public String getType(){
    return type;
  }
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


  abstract double calculate(String displayText);
}

