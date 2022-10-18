package commands.shapes;

public class Color {
    String curColor;
    String prevColor;

    public void execute(String color) {
        prevColor = this.curColor;
        this.curColor = color;
    }

    public void undo(String prevColor) {
        curColor = this.prevColor;
        this.prevColor = prevColor;
    }

    public void setColor(String color) {
        curColor = color;
    }

    public String getColor() {
        return curColor;
    }
}
