package bai_tap_lam_them.Method;

import bai_tap_lam_them.Class.XeTai;

import java.util.ArrayList;
import java.util.Arrays;

public class XeTaiListAndMethod extends VehicleMethod {
    //Xe tải
    static ArrayList<XeTai> xeTaiList = new ArrayList<>(Arrays.asList(
            new XeTai("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3),
            new XeTai("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9),
            new XeTai("43C-45.235", "Hino", 2021, "Nguyễn Văn C", 12)
    )
    );

    public static ArrayList<XeTai> getXeTaiList () {
        return xeTaiList;
    }

    public static void displayXeTaiList() {
        System.out.println("DANH SÁCH XE TẢI");
        for (XeTai i : xeTaiList) {
            System.out.format("Biển số: %-15s Tên Hãng: %-10s Năm sản xuất: %-15s Tên chủ xe: %-15s Tải trọng: %-5s \n",
                    i.bienKiemSoat,
                    i.hangSanXuat,
                    i.namSanXuat,
                    i.chuSoHuu,
                    i.taiTrong
            );
        }
    }

    public static void addXeTai() {
        try {
            addPhuongTien();

            System.out.println("Mời nhập tải trọng");
            int taiTrong = Integer.parseInt(scanner.nextLine());
            xeTaiList.add(new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong));

        } catch (Exception e) {
            System.err.println("Nhập lỗi, mời nhập lại!");
            addXeTai();
        }
    }

}
