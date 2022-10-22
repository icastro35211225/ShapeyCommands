package commands.shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;
    private double[] cooridnates = origin.getOrigin();

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        color.setColor("Red");
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
        return "Rectangle, Color: " + color + ", Origin: (" + cooridnates[0] + ", " + cooridnates[1] + "), Width: "
                + width
                + ", Height: " + height;
    }
}