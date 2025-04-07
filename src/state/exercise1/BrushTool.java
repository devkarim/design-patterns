package state.exercise1;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush released");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw something");
    }
}
