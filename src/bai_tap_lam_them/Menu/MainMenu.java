package bai_tap_lam_them.Menu;

import java.util.Scanner;

public class MainMenu {
    public static void displayMenu() {
        System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ");
        System.out.println("                Chọn chức năng               ");
        System.out.println("    1.  Thêm phương tiện mới ");
        System.out.println("    2.  Hiển thị phương tiện ");
        System.out.println("    3.  Xóa phương tiện");
        System.out.println("    4.  Thoát");

        System.out.println(" Mời nhập số với chức năng tương ứng ");
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 4) {
                System.err.println("Số vừa nhập không phù hợp");
                displayMenu();
            }
            switch (choice) {
                case 1:
                    SubMenuThemPhuongTien.themPhuongTienMoi();
                    break;
                case 2:
                    SubMenuHienThi.hienThiPhuongTien();
                    break;
                case 3:
                    SubMenuXoaPhuongTien.xoaPhuongTien();
                    break;
                case 4:
                    System.out.println("KẾT THÚC CHƯƠNG TRÌNH");
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.err.println("Lỗi nhập!");
            displayMenu();
        }
    }
}
