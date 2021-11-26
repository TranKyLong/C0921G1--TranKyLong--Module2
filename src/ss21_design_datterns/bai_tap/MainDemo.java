package ss21_design_datterns.bai_tap;

public class MainDemo {
    public static void main(String[] args) {
        ShapeFactory myFactory = new ShapeFactory();

        Shape s1 = myFactory.getShape("vuong");
        s1.draw();

        Shape s2 = myFactory.getShape("tron");
        s2.draw();

        Shape s3 = myFactory.getShape("");
        s3.draw();

    }
}
