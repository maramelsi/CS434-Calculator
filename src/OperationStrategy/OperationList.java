package OperationStrategy;

import java.util.ArrayList;

public class OperationList {
    private static OperationList instance;
    private static ArrayList<Operation> operations = new ArrayList<>();

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
    }

    public static OperationList getInstance(){
        if(instance == null)
            instance = new OperationList();
        return instance;
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