package OperationStrategy;

import java.util.ArrayList;

public class OperationList {
    private static OperationList instance;
    private static final ArrayList<Operation> operations = new ArrayList<>();

    //constructor
    private OperationList(){
        operations.add(new AddOperation());
        operations.add(new SubstractOperation());
        operations.add(new MultiplyOperation());
        operations.add(new DivideOperation());
        operations.add(new SinOperation());
        operations.add(new CosOperation());
        operations.add(new LogOperation());
        operations.add(new COperation());
       // operations.add(new EqualOperation());
    }

    public static OperationList getInstance(){
        if(instance == null)
            instance = new OperationList();
        return instance;
    }
    public void add(Operation operation){
        operations.add(operation);
    }
    public void remove(Operation operation){
        operations.remove(operation);
    }
    public boolean containsOp(final String type){
        return operations.stream().filter(o->o.getType().equals(type)).findFirst().isPresent();
    }

    public static Operation operationType(String type){

        for (var operation : operations) {
            if (operation.getType().equals(type)) {
                return operation;
            }
        }
        return null;
    }

}
