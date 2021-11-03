package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        System.out.println(Circle.radius);
        System.out.println(myCircle.getArea());
    }
}
