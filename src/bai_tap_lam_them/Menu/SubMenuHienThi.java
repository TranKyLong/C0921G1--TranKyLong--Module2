package bai_tap_lam_them.Menu;

import bai_tap_lam_them.Method.XeMayListAndMethod;
import bai_tap_lam_them.Method.XeOtoListAndMethod;
import bai_tap_lam_them.Method.XeTaiListAndMethod;

import java.util.Scanner;

public class SubMenuHienThi  {
    static Scanner scanner = new Scanner(System.in);
    public static void returnHienThiPhuongTien() {
        System.out.println("Ấn phím bất kỳ để trở về menu hiển thị phương tiện");
        scanner.next();
        scanner.nextLine(); //chống trôi lệnh trong Java
        SubMenuHienThi.hienThiPhuongTien();
    }

    public static void hienThiPhuongTien() {

        System.out.println(" HIỂN THỊ PHƯƠNG TIỆN ");
        System.out.println("  1.  Hiển thị Xe Tải");
        System.out.println("  2.  Hiển thị Xe Ô tô");
        System.out.println("  3.  Hiển thị Xe Máy");
        System.out.println("  4.  Trở về menu chính");
        System.out.println("Nhập số tương ứng với loại phương tiện muốn hiển thị");

        try {
            int loaiPhuongTien = Integer.parseInt(scanner.nextLine());
            switch (loaiPhuongTien) {
                default:
                    System.err.println("Số vừa nhập không phù hợp");
                    hienThiPhuongTien();
                case 1:
                    XeTaiListAndMethod.displayXeTaiList();
                    returnHienThiPhuongTien();
                    break;
                case 2:
                    XeOtoListAndMethod.displayXeOtoList();
                    returnHienThiPhuongTien();
                    break;
                case 3:
                    XeMayListAndMethod.displayXeMayList();
                    returnHienThiPhuongTien();
                    break;
                case 4:
                    MainMenu.displayMenu();
                    break;
            }
        } catch (Exception e) {
            System.err.println("Lỗi nhập!");
            hienThiPhuongTien();
        }
    }
}
