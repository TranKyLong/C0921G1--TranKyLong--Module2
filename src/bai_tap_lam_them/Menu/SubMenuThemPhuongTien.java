package bai_tap_lam_them.Menu;

import bai_tap_lam_them.Method.XeMayListAndMethod;
import bai_tap_lam_them.Method.XeOtoListAndMethod;
import bai_tap_lam_them.Method.XeTaiListAndMethod;

import java.util.Scanner;

public class SubMenuThemPhuongTien {
    static Scanner scanner = new Scanner(System.in);

    public static void returnThemPhuongTien() {

        System.out.println("Thêm thành công, ấn phím bất kỳ để trở về menu thêm phương tiện");
        scanner.next();
        scanner.nextLine(); //chống trôi lệnh trong Java
        themPhuongTienMoi();
    }

    public static void themPhuongTienMoi() {
        System.out.println(" THÊM PHƯƠNG TIỆN MỚI ");
        System.out.println("  1.  Thêm Xe Tải");
        System.out.println("  2.  Thêm Xe Ô tô");
        System.out.println("  3.  Thêm Xe Máy");
        System.out.println("  4.  Trở về menu chính");

        System.out.println("Nhập số tương ứng với loại phương tiện muốn thêm");
        try {
            int loaiPhuongTien = Integer.parseInt(scanner.nextLine());

            switch (loaiPhuongTien) {
                case 1:
                    XeTaiListAndMethod.addXeTai();
                    returnThemPhuongTien();
                    break;
                case 2:
                    XeOtoListAndMethod.addXeOto();
                    returnThemPhuongTien();
                    break;
                case 3:
                    XeMayListAndMethod.addXeMay();
                    returnThemPhuongTien();
                    break;
                case 4:
                    MainMenu.displayMenu();
                    break;
                default:
                    System.err.println("Số vừa nhập không phù hợp");
                    themPhuongTienMoi();
            }
        } catch (Exception e) {
            System.err.println("Lỗi nhập!");
            themPhuongTienMoi();
        }
    }
}
