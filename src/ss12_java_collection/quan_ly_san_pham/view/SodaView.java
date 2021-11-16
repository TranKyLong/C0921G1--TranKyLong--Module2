package ss12_java_collection.quan_ly_san_pham.view;

import ss12_java_collection.quan_ly_san_pham.models.SodaMenu;

import java.util.Scanner;

public class SodaView {
    public static SodaMenu getUserOption() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Thêm sản phẩm\n" +
                "2. Sửa thông tin sản phẩm theo id\n" +
                "3. Xoá sản phẩm theo id\n" +
                "4. Hiển thị danh sách sản phẩm\n" +
                "5. Tìm kiếm sản phẩm theo tên\n" +
                "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                "7. Sắp xếp sản phẩm giảm dần theo giá ");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("-------");

        return new SodaMenu(choice);
    }
}
