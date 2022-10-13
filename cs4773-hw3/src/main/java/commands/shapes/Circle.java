package commands.shapes;

public class Circle extends Shape {
    private int radius;
    private String color = "Blue";

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void color(String color) {
        this.color = color;
    }

    public String draw() {
        return "Circle, Color: " + color + ", Origin: (" + origin[0] + ", " + origin[1] + "), Radius: " + radius;
    }
}