package ss7_abstract_class_interface.bai_tap.resizeable;

public class MainTest {
    public static void main(String[] args) {
        //kiểm thử lớp shape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape + "\n");

        // kiểm thủ lớp hình tròn
        Circle tron = new Circle();
        System.out.println(tron);

        Circle hinh_tron = new Circle(15.5, "SORROW", false);
        System.out.println(hinh_tron + "\n");

        // kiểm thủ lớp hình vuông
        Square vuong = new Square();
        System.out.println(vuong);

        Square hinh_vuong = new Square(30.5, "yellow", false);
        System.out.println(hinh_vuong + "\n");

        // kiểm thủ lớp hình chữ nhật
        Rectangle hcn = new Rectangle();
        System.out.println(hcn);

        Rectangle hinh_chu_nhat = new Rectangle(15, 25, "blued ", true);
        System.out.println(hinh_chu_nhat + "\n");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=");
        System.out.println("\n");
        double myRandom = Math.floor(Math.random() * 100) + 1; //biến random từ 1 - 100

        //mảng đối tượng các hình
        Shape[] array = new Shape[3];

        array[0] = new Circle(20, "white", true);
        System.out.println((array[0]).toString());
        System.out.println("after increasing the area is " + ((Circle) array[0]).resizeable(myRandom) + "\n");

        array[1] = new Rectangle(40, 20, "ocean", true);
        System.out.println((array[1]).toString());
        System.out.println("after increasing the area is " + ((Rectangle) array[1]).resizeable(myRandom) + "\n");

        array[2] = new Square(40, "red", false);
        System.out.println((array[2]).toString());
        System.out.println("after increasing the area is " + ((Square) array[2]).resizeable(myRandom));

    }
}
