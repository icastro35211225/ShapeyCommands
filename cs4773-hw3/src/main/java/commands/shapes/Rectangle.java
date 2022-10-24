package commands.shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;
    private Origin origin;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        origin = new Origin(0, 0);
        color = Color.Red;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String draw() {
        return "Rectangle, Color: " + color + ", Origin: (" + origin.getX() + ", " + origin.getY() + "), Width: "
                + width
                + ", Height: " + height;
    }
}