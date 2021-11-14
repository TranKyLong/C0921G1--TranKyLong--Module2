package bai_tap_lam_them.Method;
import bai_tap_lam_them.Class.AbstractPhuongTien;
import bai_tap_lam_them.Class.XeMay;
import bai_tap_lam_them.Class.XeOto;
import bai_tap_lam_them.Class.XeTai;
import bai_tap_lam_them.Menu.MainMenu;
import bai_tap_lam_them.Menu.SubMenuXoaPhuongTien;
import java.util.Scanner;


public class VehicleMethod extends AbstractPhuongTien {
    protected static String bienKiemSoat;
    protected static String hangSanXuat;
    protected static int namSanXuat;
    protected static String chuSoHuu;

    protected static Scanner scanner = new Scanner(System.in);

    protected static void addPhuongTien() {

        System.out.println("Mời nhập biển kiểm soát");
        bienKiemSoat = scanner.nextLine();

        System.out.println("Mời nhập hãng sản xuất");
        hangSanXuat = scanner.nextLine();

        System.out.println("Mời nhập năm sản xuất");
        namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời nhập tên chủ sở hữu");
        chuSoHuu = scanner.nextLine();
    }

    public static void nhapBienSo() {
        boolean flag = true;
        do {
            if (flag) {
                System.out.println("mời nhập biển số xe muốn xóa (nhập Exit để thoát)");
            } else {
                System.err.println("Không có biển số này, mời nhập lại (nhập Exit để thoát)");
            }

            String bienSo = scanner.nextLine();
            if (bienSo.equals("exit") || bienSo.equals("Exit") || bienSo.equals("EXIT")) {
                MainMenu.displayMenu();
            }
            for (XeOto i : XeOtoListAndMethod.getOtoList()) {
                if (i.bienKiemSoat.equals(bienSo)) {
                    bienSo = i.bienKiemSoat;
                    xacNhan(bienSo);
                } else {
                    flag = false;
                }
            }
            for (XeMay i : XeMayListAndMethod.getXeMayList()) {
                if (i.bienKiemSoat.equals(bienSo)) {
                    bienSo = i.bienKiemSoat;
                    xacNhan(bienSo);
                } else {
                    flag = false;
                }
            }
            for (XeTai i : XeTaiListAndMethod.getXeTaiList()) {
                if (i.bienKiemSoat.equals(bienSo)) {
                    bienSo = i.bienKiemSoat;
                    xacNhan(bienSo);
                } else {
                    flag = false;
                }
            }
        } while (!flag);
    }

    static void xacNhan(String bienSo) {
        System.out.println("Xác nhận xóa phương tiện này?\n  ( chỉ nhập 1, 2 )");
        System.out.println(" [ 1. Yes ]  /  [ 2. No and Return ] ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                xoaXe(bienSo);
                break;
            case 2:
                MainMenu.displayMenu();
                break;
            default:
                System.err.println("Nhập lỗi, mời nhập lại");
                break;
        }

    }
    static void xoaXe(String bienSo) {
        XeOtoListAndMethod.getOtoList().removeIf(i -> i.bienKiemSoat.equals(bienSo));
        XeTaiListAndMethod.getXeTaiList().removeIf(i -> i.bienKiemSoat.equals(bienSo));
        XeMayListAndMethod.getXeMayList().removeIf(i -> i.bienKiemSoat.equals(bienSo));

        System.out.println("Xóa thành công ! Ấn phím bất kỳ để trở về menu xóa phương tiện");
        scanner.nextLine(); //chống trôi lệnh trong Java
        SubMenuXoaPhuongTien.xoaPhuongTien();
    }
}




