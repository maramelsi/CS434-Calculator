package CommandPattern;

import SingletonResult.Result;

import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> history = new ArrayList<>();
    private Result result = Result.getInstance();
    private static int current = 0;

    public double undo() {
           if (current > 0) {
                current--;
                Command command = history.get(current);
                history.remove(command);
                return command.unExecute();
            }
       else return result.getDoubleResult();
    }

    public double compute(String operation, String operand) {
        Command command = new ConcreteCommand(operation, operand);
        history.add(command);
        current++;
        return command.execute();
    }
}
