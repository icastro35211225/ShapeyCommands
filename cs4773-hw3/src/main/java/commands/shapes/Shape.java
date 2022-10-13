package commands.shapes;

public abstract class Shape {
    int[] origin = { 0, 0 };
    int index = -1;
    Color color = new Color();

    public final int[] getOrigin() {
        return origin;
    }

    public final void setOrigin(int[] origin) {
        this.origin = origin;
    }

    abstract void color(String color);

    abstract String draw();
}
