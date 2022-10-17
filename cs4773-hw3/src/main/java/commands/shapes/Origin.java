package commands.shapes;

public class Origin {
    int[] coordinates;
    int[] prevCoordinates;

    public void execute(Shape shape, int[] coordinates) {
        prevCoordinates = shape.getOrigin();
        this.coordinates = coordinates;
    }

    public void undo(int[] prevCoordinates) {
        coordinates = prevCoordinates;
    }
}
