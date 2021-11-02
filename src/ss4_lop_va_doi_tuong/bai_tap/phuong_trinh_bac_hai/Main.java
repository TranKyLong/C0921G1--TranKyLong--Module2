package ss4_lop_va_doi_tuong.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Phương trình có dạng aX^2 + bX + c = 0 ");

        System.out.println("mời nhập hệ số a");
        float a = input.nextFloat();
        System.out.println("mời nhập hệ số b");
        float b = input.nextFloat();
        System.out.println("mời nhập hệ số c");
        float c = input.nextFloat();

        QuadraticEquation PhuongTrinh = new QuadraticEquation(a, b, c);
        System.out.println(PhuongTrinh.getRoot());

    }
}