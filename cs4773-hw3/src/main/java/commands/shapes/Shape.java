package commands.shapes;

public abstract class Shape {
    public String[] colors = { "Red", "Blue", "Yellow", "Orange", "Green" };

    final void createRectangle(int height, int width) {
        Rectangle newRectangle = new Rectangle(height, width, colors[0]);

    }

    abstract void draw();
}
