package ss7_abstract_class_interface.bai_tap.Colorable;

public class Square extends Shape implements Colorable {
    double edge = 1;

    public Square() {
    }


    public Square(double edge, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double radius) {
        this.edge = radius;
    }

    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }


    @Override
    public String toString() {
        return "A Square with edge= "
                + getEdge()
                + ", has an area of "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "color all 4 side ";
    }
}
