package command.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private final List<Command> commandList = new ArrayList<>();

    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void execute() {
        for (var cmd : commandList)
            cmd.execute();
    }
}
