package ss6_ke_thua.thuc_hanh;

import java.util.Scanner;

public class Shape {
    Scanner myFill = new Scanner(System.in);
    String color = "green";
    boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected String tostring() {
        String fill;
        if (filled = true) {
             fill = "filled";
        } else {
             fill = "not filed";
        }
        return "A Shape with color of"
                + getColor()
                + "  and "
                + fill;
    }
}
