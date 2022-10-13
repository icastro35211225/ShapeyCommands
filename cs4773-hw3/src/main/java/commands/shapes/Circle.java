package commands.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        color.setColor("blue");
    }

    public Color getColor() {
        return color;
    }

    public String draw() {
        return "Circle, Color: " + color + ", Origin: (" + origin[0] + ", " + origin[1] + "), Radius: " + radius;
    }
}