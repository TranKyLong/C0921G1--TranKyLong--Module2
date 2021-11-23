package ss17_serialization.bai_tap.controller;

import ss17_serialization.bai_tap.services.Impl.Function;

import java.util.Scanner;

public class TheProductController {
    static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println(" 1. Thêm sản phẩm");
        System.out.println(" 2. Hiển thị tất cả");
        System.out.println(" 3. Tìm sản phẩm");
        System.out.println(" 4. Thót chuowg trình");
        Function myFunction = new Function();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                myFunction.adding();
                showMenu();
                break;
            case 2:
                myFunction.show();
                showMenu();
                break;
            case 3:
                myFunction.find();
                showMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.err.println("Lỗi, mời nhập lại");
                showMenu();
                break;

        }
    }
}
