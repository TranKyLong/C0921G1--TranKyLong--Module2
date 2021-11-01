package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TongSoDuongCheoChinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Mời nhập chiều dài và rộng của ma trận");
        int size = input.nextInt();
        long[][] matrix = new long[size][size];
        long total = 0;
        for (int i = 0; i < size; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                System.out.println(" mời nhập các phần tử của ma trận");
                matrix[i][x] = input.nextInt();

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
        }
        System.out.println(" Tổng các phần tử ở đường chéo chính của ma trận là: " + total);
    }
}
