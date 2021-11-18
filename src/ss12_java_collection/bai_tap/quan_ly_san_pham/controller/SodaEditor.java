package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;

import java.util.Scanner;

public class SodaEditor {
    static Scanner scanner = new Scanner(System.in);

    static void editSoda() {

        System.out.println("Nhập ID sản phẩm cần sửa ");

        int input = Integer.parseInt(scanner.nextLine());

        for (SodaClass i : SodaList.getSodaList()
        ) {
            if (input == i.getId()) {
                checkID(i);
            }
        }
    }
    private static void checkID(SodaClass i) {
        System.out.println(" CHỌN SỐ TƯƠNG ỨNG VỚI LOẠI THÔNG TIN CẦN SỬA : ");
        System.out.println(" Thông tin hiện tại là : ");
        System.out.println("1. ID: " + i.getId());
        System.out.println("2. Tên: " + i.getName());
        System.out.println("3. Giá: " + i.getPrice());
        System.out.println("4. Hạn Sử DỤng: " + i.getHanSuDung());

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.print("Id mới là");
                choice = Integer.parseInt(scanner.nextLine());
                i.setId(choice);
                break;
            case 2:
                System.out.print("Tên mới là");
                String newName = scanner.nextLine();
                i.setName(newName);
                break;
            case 3:
                System.out.print("giá mới là (nghìn VND)");
                choice = Integer.parseInt(scanner.nextLine());
                i.setPrice(choice);
                break;
            case 4:
                System.out.print("hạn sử dụng (Ngày)");
                choice = Integer.parseInt(scanner.nextLine());
                i.setHanSuDung(choice);
                break;
            default:
                System.out.println("Lỗi, mời nhập lại");
                checkID(i);
                break;
        }
        System.out.println("Đổi thành công ! ");
    }

}