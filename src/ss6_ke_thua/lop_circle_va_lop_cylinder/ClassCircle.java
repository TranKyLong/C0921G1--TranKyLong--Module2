package ss6_ke_thua.lop_circle_va_lop_cylinder;

public class ClassCircle {
    public double radius;
    public String color;

    public ClassCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * 3.1416;
    }

    public String toString() {
        return " Hình tròn \n Bán kính: " + radius + "\n Màu sắc: " + color + "\n Diện tích: " + getArea();
    }
}
