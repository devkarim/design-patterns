package command.exercise1;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
