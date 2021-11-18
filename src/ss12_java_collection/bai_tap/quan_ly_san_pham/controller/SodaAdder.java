package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;

import java.util.Scanner;

public class SodaAdder extends SodaList {

    static Scanner scanner = new Scanner(System.in);

    public static void addSoda() {
        System.out.println("Nhập ID cho sản phẩm ");
        int sodaId = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sản phẩm ");
        String sodaName = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm ");
        int sodaPrice = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập hạn sử dụng ");
        int sodaHanSuDung = Integer.parseInt(scanner.nextLine());

        SodaList.sodaList.add(new SodaClass(sodaId, sodaName, sodaPrice, sodaHanSuDung));
    }
}
