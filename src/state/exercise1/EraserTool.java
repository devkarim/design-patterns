package state.exercise1;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser released");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
