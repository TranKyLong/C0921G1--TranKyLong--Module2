package ss6_ke_thua.tam_giac;

public class Shape {
    double side1 = 10;
    double side2 = 18;
    double side3 = 26;


    public Shape() {
    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = ((side1 + side2 + side3) / 2);
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public String toString() {
        return "Tam giác có độ dài 3 cạnh lần lượt là: " + "\n" + side1 + "\n" + side2 + "\n" + side3 +
                "\n" + "Diện tích là: " + getArea() + "\n" + "Chu vi là: " + getPerimeter();
    }
}
