package ss15_xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            try {
                System.out.println("Hãy nhập x: ");
                x = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.err.println("Nhập sai");
            }
        }

        int y;
        while (true) {
            try {
                System.out.println("Hãy nhập y: ");
                y = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.err.println("Nhập sai");
            }
        }

        NumberFormatException calc = new NumberFormatException();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
