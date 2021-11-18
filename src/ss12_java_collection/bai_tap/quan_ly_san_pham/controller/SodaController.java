package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaMenu;

import java.util.LinkedList;
import java.util.Scanner;

import static ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList.getSodaList;

public class SodaController {
    static Scanner scanner = new Scanner(System.in);

    public SodaController() {
    }

    public static void checkMenu(SodaMenu user) {
        switch (user.getMenuOption()) {
            case 1:
                addSoda();
                break;
            case 2:
                editSoda();
                break;
            case 3:
                deleteSoda();
                break;
            case 4: //Hiển thị danh sách sản phẩm
                displaySodaList(getSodaList());
                break;
            case 5:
                findSoda();
                break;
            case 6:
                SapXepTangDan.sapXepTang();
                break;
            case 7:
                SapXepGiamDan.sapXepGiam();
                break;

        }
    }

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

    public static void deleteSoda() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int nhapID = Integer.parseInt(scanner.nextLine());

        getSodaList().removeIf(i -> i.getId() == nhapID);
        System.out.println("Xóa thành công");
    }

    public static void displaySodaList(LinkedList<SodaClass> array) {
        System.out.format("%-10s %-15s %-10s %-10s\n",
                "ID ",
                "TÊN SẢN PHẨM ",
                "GIÁ ",
                "HẠN SỬ DỤNG ");
        for (SodaClass i : array
        ) {
            System.out.format("%-10s %-15s %-10s %-10s\n",
                    i.getId(),
                    i.getName(),
                    i.getPrice(),
                    i.getHanSuDung());
        }
    }

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
