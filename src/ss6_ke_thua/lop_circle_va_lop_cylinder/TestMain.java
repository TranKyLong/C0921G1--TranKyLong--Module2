package ss6_ke_thua.lop_circle_va_lop_cylinder;

public class TestMain {
    public static void main(String[] args) {
        ClassCircle hinhTron = new ClassCircle(15,"black");
        System.out.println(hinhTron.toString());

        Cylinder hinhTru = new Cylinder(20, "green ", 15.5);
        System.out.println(hinhTru.toString());
    }
}
