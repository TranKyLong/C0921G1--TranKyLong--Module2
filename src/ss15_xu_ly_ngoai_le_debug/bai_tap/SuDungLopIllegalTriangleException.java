package ss15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] triangleSide = new int[3];
        for (int i = 0; i < triangleSide.length; i++) {
            while (true) {
                try {
                    System.out.println("Nhập chiều dài cạnh "  +(i + 1) + " bằng một số lớn hơn 0");
                    triangleSide[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception e) {

                    System.err.println("Nhập lỗi, mời nhập lại từ đầu");
                }
            }
        }

        int side1 = triangleSide[0];
        int side2 = triangleSide[1];
        int side3 = triangleSide[2];
        soAm(side1 * side2 * side3);
        kiemTraDoDai(side1, side2, side3);
    }

    static void soAm(int value) {
        if (value <= 0) {
            throw new ArithmeticException(" Chiều dài cạnh không thể <= 0! ");
        }
    }

    static void kiemTraDoDai(int s1, int s2, int s3) {
        if (s1 > s2 + s3 || s2 > s1 + s3 || s3 > s1 + s2) {
            throw new ArithmeticException(" 1 cạnh không thể lớn hơn tổng 2 cạnh kia! ");
        }
    }
}
