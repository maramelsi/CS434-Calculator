package SingletonResult;

public class Result {
    private static Result instance;
    private double total;
    private boolean isNumber = true;

    public double getDoubleResult(){
        return total ;
    }
    public void setDoubleResult(double total){
        this.total = total;
    }
    public void clearResult(){this.total = 0;}
    public void setBool(boolean isNumber){
        this.isNumber = isNumber;
    }
    public boolean getBool(){
        return isNumber;
    }
    public static Result getInstance(){
        if(instance == null)
            instance = new Result();
        return instance;
    }
}