package commands.shapes;

public class Circle extends Shape {
    private int radius;
    private Origin origin;

    public Circle(int radius) {
        this.radius = radius;
        origin = new Origin(0, 0);
        color = Color.Blue;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public int getRadius() {
        return radius;
    }

    public Origin getOrigin() {
        return origin;
    }

    public String draw() {
        return "Circle, Color: " + color + ", Origin: (" + origin.getX() + "," + origin.getY() + "), Radius: "
                + radius;
    }
}