package command.exercise2;

public interface UndoableCommand extends Command {
    void unexecute();
}
