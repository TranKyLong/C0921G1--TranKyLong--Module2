package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhatMang {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println(" Mời nhập số hàng của mảng");
        int row = myInput.nextInt();
        System.out.println(" Mời nhập số cột của mảng");
        int col = myInput.nextInt();
        float[][] matrix = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                System.out.println(" Mời nhập phần tử của mảng");
                matrix[i][x] = myInput.nextFloat();
            }
        }
        float max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < row; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                if (matrix[i][x] > max) {
                    max = matrix[i][x];
                    maxRow = i;
                    maxCol = x;
                }
            }
        }
        System.out.println(" Phần tử lớn nhất mảng là: " + max);
        System.out.println(" có tọa độ ở hàng " + maxRow + " và cột " + maxCol);
    }
}
