package ss6_ke_thua.bai_tap.tam_giac;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle tamGiac = new Triangle(20, 30, 40, "pinky");
        System.out.println("Tam giác có màu: " + tamGiac.getColor() + "\n"+tamGiac.toString());
    }
}
