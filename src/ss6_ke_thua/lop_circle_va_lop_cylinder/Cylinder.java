package ss6_ke_thua.lop_circle_va_lop_cylinder;

public class Cylinder extends ClassCircle {
    public double high;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;

    }

    public String getCylinderArea() {
        return "Diện tích xung quanh hình trụ: " + 2 * 3.1416 * radius * high +
                "\nDiện tích toàn phần hình trụ: " + 2 * 3.1416 * radius * (radius + high);

    }

    @Override
    public String toString() {
        return "Hình trụ có \nBán kính : " + radius + "\n Màu sắc: " + color + "\n Chiều cao: " + high +"\n" + getCylinderArea();
    }
}
