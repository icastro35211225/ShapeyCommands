package commands.shapes;

public class Circle extends Shape {
    private double radius;
    private double[] coordinates = origin.getOrigin();

    public Circle(double radius) {
        this.radius = radius;
        color.setColor("blue");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return "Circle, Color: " + color + ", Origin: (" + coordinates[0] + ", " + coordinates[1] + "), Radius: "
                + radius;
    }
}