package ss4_lop_va_doi_tuong.thuc_hanh;

public class LopHinhchuNhat {
    double width, height;

    public LopHinhchuNhat() {
    }

    public LopHinhchuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

