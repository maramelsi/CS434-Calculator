package CommandPattern;

import OperationStrategy.Operation;
import java.util.ArrayList;

public class CommandHistory {
    private ArrayList<Command> history = new ArrayList<>();
    private static int current = 0;

    public void redo(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current < history.size()) {
                Command command = history.get(current);
                current++;
                command.execute();
            }
        }
    }

    public double undo(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current >= 0) {
                current--;
                Command command = history.get(current);
                return command.unExecute();
            }
        }
        return 0;
    }

    public double compute(String operation, String operand) {
        Command command = new ConcreteCommand(operation, operand);
        history.add(command);
        current++;
        return command.execute();
    }
}
