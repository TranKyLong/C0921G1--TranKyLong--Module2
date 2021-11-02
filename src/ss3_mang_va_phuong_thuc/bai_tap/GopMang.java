package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập độ dài mảng thứ nhất");
        int lenght1 = input.nextInt();
        long[] array1 = new long[lenght1];

        for (int i = 0; i < lenght1; i++) {
            System.out.println("Mời nhập các phần tử số nguyên của mảng thứ nhất");
            array1[i] = input.nextInt();
        }
        System.out.println("Mời nhập độ dài mảng thứ hai");
        int lenght2 = input.nextInt();
        long[] array2 = new long[lenght2];

        for (int i = 0; i < lenght2; i++) {
            System.out.println("Mời nhập các phần tử số nguyên của mảng thứ hai");
            array2[i] = input.nextInt();
        }

        long[] totalArray = new long[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            totalArray[i] = array1[i];
        }

        int newlenght = 0;
        for (int x = array1.length; x < totalArray.length; x++) {
            totalArray[x] = array2[newlenght];
            newlenght++;

        }
        System.out.print(Arrays.toString(totalArray));
    }
}
