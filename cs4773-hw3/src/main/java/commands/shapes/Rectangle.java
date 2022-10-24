package commands.shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;
    private Origin origin;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        origin = new Origin(0, 0);
        color = Color.Red;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getHeigth() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Origin getOrigin() {
        return origin;
    }

    public String draw() {
        return "Rectangle, Color: " + color + ", Origin: (" + origin.getX() + "," + origin.getY() + "), Width: "
                + width
                + ", Height: " + height;
    }
}