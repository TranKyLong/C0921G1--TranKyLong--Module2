package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {

    public static double radius = 1.0;

    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;

    }
    public  Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.1416;
    }
}
