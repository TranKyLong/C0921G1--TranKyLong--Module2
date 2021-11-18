package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;

import java.util.Scanner;

public class SodaFinder {
    public static void findSoda() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        String inputName = scanner.nextLine();

        for (SodaClass i : SodaList.getSodaList()
        ) {
            if (i.getName().equals(inputName)) {
                System.out.format("%-10s %-15s %-10s %-10s\n",
                        "ID ",
                        "TÊN SẢN PHẨM ",
                        "GIÁ ",
                        "HẠN SỬ DỤNG ");
                System.out.format("%-10s %-15s %-10s %-10s\n",
                        i.getId(),
                        i.getName(),
                        i.getPrice(),
                        i.getHanSuDung());
            }
        }
    }
}
