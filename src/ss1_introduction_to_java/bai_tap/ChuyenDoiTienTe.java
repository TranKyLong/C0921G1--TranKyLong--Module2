package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        long usd;
        long vnd = 23000L;
        System.out.println("mời nhập số USD muốn đỏi");
        Scanner giaTri = new Scanner(System.in);
        usd = giaTri.nextLong();

        // nếu user nhập USD <=0 thì yêu cầu nhập lại
        while (usd <= 0) {
            System.out.println("giá trị nhập không hợp lệ, mời nhập lại số USD muốn đỏi");
            usd = giaTri.nextLong();
        }

        ///chuyển đổi giá trị và in ra
        long quyDoi = usd * vnd;
        System.out.println("quy đổi sang VND là: " + quyDoi);
    }
}
