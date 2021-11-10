package ss7_abstract_class_interface.bai_tap.Colorable;

public class Square implements Colorable {
    private double edge = 1.0;


    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }


    public Square(double edge, String color, boolean filled) {
        this.edge = edge;
    }


    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return 4 * edge;
    }


    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + "whit area "
                + getArea();

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
