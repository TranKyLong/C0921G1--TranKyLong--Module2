package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" mời nhập độ dài lớn hơn 0 của mảng ");
        int lenght = input.nextInt();

        while (lenght <= 0) {
            System.out.println("giá trị nhập vào không hợp lệ, mời nhập lại");
            lenght = input.nextInt();
        }

        System.out.println(" mời nhập vị trí trong mảng của phần tử muốn thêm (bắt đầu từ 0)");
        int index = input.nextInt();
        while (index < 0) {
            System.out.println("giá trị nhập vào không hợp lệ, mời nhập lại");
            index = input.nextInt();
        }

        System.out.println(" mời nhập phần tử số nguyên muốn thêm");
        int element = input.nextInt();

        long[] array = new long[lenght];
        array[index] =element;

        System.out.println( "mảng và phần tử vừa được tạo là: " + Arrays.toString(array) + ", ");

    }
}
