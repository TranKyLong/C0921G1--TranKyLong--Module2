package ss7_abstract_class_interface.bai_tap.Colorable;

public class MainTest {
    public static void main(String[] args) {

        Shape[] array = new Shape[3];

        array[0] = new Circle(20, "white", true);
        System.out.println((array[0]).toString());

        array[1] = new Rectangle(40, 20, "ocean", true);
        System.out.println((array[1]).toString());

        array[2] = new Square(40, "red", false);
        System.out.println((array[2]).toString());

        System.out.println( ((Square)array [2]).howToColor());
    }
}
