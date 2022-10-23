package commands.shapes;

public abstract class Shape {
    Origin origin;
    int index = -1;
    Color color;

    public final Origin getOrigin() {
        return origin;
    }

    public final Color getColor() {
        return color;
    }

    public final void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public final void setColor(Color color) {
        this.color = color;
    }

    public abstract String draw();

}
