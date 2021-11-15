package bai_tap_lam_them.Method;

import bai_tap_lam_them.Class.XeMay;

import java.util.ArrayList;
import java.util.Arrays;

public class XeMayListAndMethod extends VehicleMethod {
    //Xe máy
    static ArrayList<XeMay> xeMayList = new ArrayList<>(Arrays.asList(
            new XeMay("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3),
            new XeMay("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9),
            new XeMay("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12),
            new XeMay("003", "Hino", 2000, "Nguyễn Văn Văn", 21)
    )
    );

    public static ArrayList<XeMay> getXeMayList() {
        return xeMayList;
    }
    public static void displayXeMayList() {
        System.out.println("DANH SÁCH XE MÁY");
        for (XeMay i : xeMayList) {
            System.out.format("Biển số: %-15s Tên Hãng: %-10s Năm sản xuất: %-15s Tên chủ xe: %-15s Công suất: %-5s \n",
                    i.getBienKiemSoat(),
                    i.getHangSanXuat(),
                    i.getNamSanXuat(),
                    i.getChuSoHuu(),
                    i.congSuat
            );
        }
    }

    public static void addXeMay() {
        try {
            addPhuongTien();

            System.out.println("Mời nhập công suất");
            int congSuat = Integer.parseInt(scanner.nextLine());

            xeMayList.add(new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat));

        } catch (Exception e) {
            System.err.println("Nhập lỗi, mời nhập lại!");
            addXeMay();
        }
    }
}
