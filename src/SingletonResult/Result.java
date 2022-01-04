package SingletonResult;

public class Result {
    private static Result instance;
    private double total;

    public double getDoubleResult(){
        return total ;
    }
    public void setDoubleResult(double total){
        this.total = total;
    }
    public static Result getInstance(){
        if(instance == null)
            instance = new Result();
        return instance;
    }
}