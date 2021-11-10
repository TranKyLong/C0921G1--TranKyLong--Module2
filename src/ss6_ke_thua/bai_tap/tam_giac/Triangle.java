package ss6_ke_thua.bai_tap.tam_giac;

public class Triangle extends Shape {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tam giác có độ dài 3 cạnh lần lượt là: " + "\n" + this.side1 + "\n" + this.side2 + "\n" + this.side3 +
                "\n" + "màu sắc: " + getColor() + "\n" + "Diện tích là: " + this.getArea() + "\n" + "Chu vi là: " + this.getPerimeter();
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        super.getPerimeter();
        super.getArea();
        this.color = color;
    }
}
