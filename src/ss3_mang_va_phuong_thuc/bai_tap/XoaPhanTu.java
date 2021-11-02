package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {2, 3, 4, 5, 6, 7, 7, 4, 8, 9, 40, 8, 9, 40, 52, 56};

        System.out.println(Arrays.toString(list));
        System.out.println("mời nhập phần tử muốn xóa ");
        int excommunication = input.nextInt();

        int count = 0; // biến đếm để viết thông báo
        for (int i = 0; i < list.length; i++) {
            if (list[i] == excommunication) {
                list[i] = list[i + 1];
                count++;
            }
        }
        //hiển thị thông báo ra màn hình
        if (count == 0) {
            System.out.println("Phần tử đã nhập không có");
        } else {
            System.out.println("Phần tử đã nhập sẽ bị xóa");
        }
        System.out.println("mảng sau khi xóa các phần tử đã nhập: " + Arrays.toString(list));
    }
}
