package bai_tap_lam_them.Menu;

import bai_tap_lam_them.Method.VehicleMethod;

import java.util.Scanner;

public class SubMenuXoaPhuongTien {
    protected static Scanner scanner = new Scanner(System.in);


    public static void xoaPhuongTien() {
        System.out.println(" XÓA PHƯƠNG TIỆN ");
        System.out.println("  1.  NHẬP BIỂN SỐ CẦN XÓA");
        System.out.println("  2.  TRỞ VỀ");
        System.out.println("Nhập số tương ứng với chức năng");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {

                case 1:
                    VehicleMethod.nhapBienSo();
                    break;
                case 2:
                    MainMenu.displayMenu();
                    break;
                default:
                    System.err.println("Số vừa nhập không phù hợp");
                    xoaPhuongTien();

            }
        } catch (Exception e) {
            System.err.println("Lỗi nhập!");
            xoaPhuongTien();
        }
    }
}


