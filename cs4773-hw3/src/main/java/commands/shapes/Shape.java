package commands.shapes;

public abstract class Shape {
    int index = -1;
    Color color;

    public final Color getColor() {
        return color;
    }

    public final void setColor(Color color) {
        this.color = color;
    }

    public abstract String draw();

    public abstract Origin getOrigin();

    public abstract void setOrigin(Origin origin);
}
