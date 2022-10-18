package commands.shapes;

public class Origin {
    double[] coordinates;
    double[] prevCoordinates;

    public void setOrigin() {
        coordinates = new double[2];
        prevCoordinates = new double[2];

        coordinates[0] = 0;
        coordinates[1] = 0;

        prevCoordinates[0] = 0;
        prevCoordinates[1] = 0;
    }

    public double[] getOrigin() {
        return coordinates;
    }

    public void execute(double[] coordinates) {
        prevCoordinates = this.coordinates;
        this.coordinates = coordinates;
    }

    public void undo(double[] prevCoordinates) {
        coordinates = this.prevCoordinates;
        this.prevCoordinates = prevCoordinates;
    }
}
