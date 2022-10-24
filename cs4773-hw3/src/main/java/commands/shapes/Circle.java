package commands.shapes;

public class Circle extends Shape {
    private double radius;
    private Origin origin;

    public Circle(double radius) {
        this.radius = radius;
        origin = new Origin(0, 0);
        color = Color.Blue;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return "Circle, Color: " + color + ", Origin: (" + origin.getX() + ", " + origin.getY() + "), Radius: "
                + radius;
    }
}