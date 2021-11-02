package ss4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;


public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public String getRoot() {
        if (getDiscriminant() > 0) {
            return " Nghiệm 1 là" + (-b + Math.sqrt(getDiscriminant())) / 2 * a + " \n và " +
                    (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        } else if (getDiscriminant() == 0) {
            return "nghiện 1 bằng nghiệm 2 = " + (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        } else {
            return "vô nghiệm";
        }

    }


}



