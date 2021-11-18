package ss13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class TimKiemNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myList = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Nhập số cần tìm");
        int input = scanner.nextInt();
        timKiemNhiPhan(myList, input);
    }

    public static void timKiemNhiPhan(int[] list, int soCanTim) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (soCanTim < list[mid])
                high = mid - 1;
            if (soCanTim == list[mid]) {
                System.out.println(" Số cần tìm: " + soCanTim + " có tồn tại trong mảng");
                break;
            }
            if (soCanTim > list[mid]) {
                low = mid + 1;
            } else {
                System.out.println(" không tồn tại");
                break;
            }
        }

    }
}
