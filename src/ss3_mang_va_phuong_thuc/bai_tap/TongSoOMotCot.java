package ss3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class TongSoOMotCot {
    public static void main ( String [] args ){
        Scanner myInput = new Scanner(System.in);
        System.out.println(" Mời nhập số hàng của mảng");
        int row = myInput.nextInt();
        System.out.println(" Mời nhập số cột của mảng");
        int col = myInput.nextInt();
        float[][] matrix = new float[row][col];
        float sum = 0;
        for (int i = 0; i < row; i++) {
            for (int x = 0; x < matrix[i].length; x++) {
                System.out.println(" Mời nhập phần tử của mảng");
                matrix[i][x] = myInput.nextFloat();

            }
        }
        System.out.println(" Chọn cột muốn tính tổng");
        int colNumber = myInput.nextInt();
        for (int i = 0; i < row; i++) {
           sum+= matrix[i][colNumber];
        }
        System.out.println(" tổng các số ở cột đã chọn là: " + sum);
    }
}
