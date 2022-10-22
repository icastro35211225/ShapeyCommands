package commands.shapes;

public abstract class Shape {
    Origin origin = new Origin();
    int index = -1;
    Color color = new Color();

    public final double[] getOrigin() {
        return origin.getOrigin();
    }

    public final String getColor() {
        return color.getColor();
    }

    public final void setOrigin(double[] coordinates) {
        origin.execute(coordinates);
    }

    public final void setColor(String color) {
        this.color.setColor(color);
    }

    public abstract String draw();

}
