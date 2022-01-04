package CommandPattern;

import FrameFactory.CalculatorGUI;
import ListenersSimpleFactory.OperatorListener;
import OperationStrategy.Operation;

import java.util.ArrayList;

public class CommandHistory {
    private OperatorListener calculator;
    private Command command;
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

    public void undo(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current >= 0) {
                current--;
                Command command = history.get(current);
                command.unExecute();
            }
        }
    }

    public double compute(Operation operation, String operand) {
        Command command = new ConcreteCommand(operation, operand);
        history.add(command);
        current++;
        return command.execute();


    }
}
