package ss15_xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Scanner;

public class debug_ung_dung_java {
    public static void main(String[] args) {

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a;
        while (true) {
            try {
                a = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.err.println("Nhập sai, mời nhập lại");
                scanner.next();
            }
        }

        System.out.print("b: ");
        double b;
        while (true) {
            try {
                b = scanner.nextDouble();
                break;
            } catch (Exception e) {
                System.err.println("Nhập sai, mời nhập lại");
                scanner.next();
            }
        }

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
