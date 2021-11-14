package bai_tap_lam_them.Method;

import bai_tap_lam_them.Class.XeOto;

import java.util.ArrayList;
import java.util.Arrays;

public class XeOtoListAndMethod extends VehicleMethod {

    //Xe Ô tô
    public static ArrayList<XeOto> otoList = new ArrayList<>(Arrays.asList(
            new XeOto("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du lịch"),
            new XeOto("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe khách"),
            new XeOto("43B-453.89", "Ford", 2020, "Nguyễn Văn C", 16, "Xe khách")
    )
    );

    public static ArrayList<XeOto> getOtoList() {
        return otoList;
    }

    public static void displayXeOtoList() {
        System.out.println("DANH SÁCH XE Ô TÔ");
        for (XeOto i : otoList) {
            System.out.format("Biển số: %-15s Tên Hãng: %-10s Năm sản xuất: %-15s Tên chủ xe: %-15s Số chỗ ngồi: %-5s Loại xe: %-10s \n",
                    i.bienKiemSoat,
                    i.hangSanXuat,
                    i.namSanXuat,
                    i.chuSoHuu,
                    i.choNgoi,
                    i.kieuXe
            );
        }
    }

    public static void addXeOto() {
        try {
            VehicleMethod.addPhuongTien();
            System.out.println("Mời nhập số chỗ ngồi");
            int choNgoi = Integer.parseInt(scanner.nextLine());

            System.out.println("Mời nhập kiểu xe");
            String kieuXe = scanner.nextLine();

            otoList.add(new XeOto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, choNgoi, kieuXe));


        } catch (Exception e) {
            System.err.println("Nhập lỗi, mời nhập lại!");
            addXeOto();
        }
    }
}
