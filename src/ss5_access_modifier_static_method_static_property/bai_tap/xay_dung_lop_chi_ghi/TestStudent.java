package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Students hocSinh = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên mới cho học sinh");
        hocSinh.setName(sc.nextLine());
        System.out.println(hocSinh.name);
    }
}
