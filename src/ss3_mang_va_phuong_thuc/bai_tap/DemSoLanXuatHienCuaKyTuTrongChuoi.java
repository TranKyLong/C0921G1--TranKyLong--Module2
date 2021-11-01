package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String myString = " fan, table, laptop, snack, eat, sting, more sting, drink";
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" mời nhập ký tự muốn tìm kiếm");
        char character = input.next().charAt(0);

        for (int i = 0; i < myString.length(); i++) {
            if (character == myString.charAt(i)) {
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println(" ký tự bạn nhập không xuất hiện trong chuỗi");
        } else {
            System.out.println(" ký tự bạn nhập xuất hiện " + count + " lần trong chuỗi");
        }
    }
}
