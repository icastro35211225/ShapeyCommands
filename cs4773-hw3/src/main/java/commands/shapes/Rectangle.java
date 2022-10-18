package commands.shapes;

public class Rectangle extends Shape {
    private int height;
    private int width;
    private double[] cooridnates = origin.getOrigin();

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        color.setColor("Red");
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String draw() {
        return "Rectangle, Color: " + color + ", Origin: (" + cooridnates[0] + ", " + cooridnates[1] + "), Width: "
                + width
                + ", Height: " + height;
    }
}