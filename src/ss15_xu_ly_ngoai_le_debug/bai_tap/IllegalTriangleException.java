package ss15_xu_ly_ngoai_le_debug.bai_tap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws NegativeSideException, InappropriateLengthException {
        System.out.println("Nhập độ dài tam giác");
        Scanner scanner = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        while (true) {
            try {
                System.out.println("Nhập cạnh 1");
                side1 = scanner.nextInt();
                System.out.println("Nhập cạnh 2");
                side2 = scanner.nextInt();
                System.out.println("Nhập cạnh 3");
                side3 = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập, mời nhập lại");
                scanner.nextLine();
            }
        }
            try {
                Triangle triangle = new Triangle(side1, side2, side3);
            } catch (InappropriateLengthException | NegativeSideException e) {
                scanner.nextLine();
            }
    }
}
