package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập độ dài mảng");
        int lenght = input.nextInt();
        long[] array = new long[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Mời nhập các phần tử số nguyên của mảng");
            array[i] = input.nextInt();
        }

        long min = array[0];
        for (int x = 0; x < array.length; x++) {
            if (array[x] < min) {
                min = array[x];
            }
        }
        System.out.println("Phần tử bé nhất mảng là: " + min);


    }
}
