package commands.shapes;

public class Color {
    String curColor;
    String prevColor;

    public void setColor(String color) {
        prevColor = this.curColor;
        this.curColor = color;
    }

    public String getColor() {
        return curColor;
    }
}
