package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import java.util.Scanner;

import static ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList.getSodaList;

public class SodaDeleter {
    public static void deleteSoda() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int nhapID = Integer.parseInt(scanner.nextLine());

        getSodaList().removeIf(i -> i.getId() == nhapID);
        System.out.println("Xóa thành công");
    }
}
