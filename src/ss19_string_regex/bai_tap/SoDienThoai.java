package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SoDienThoai {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sdt;
        boolean ok;
        do {
            System.out.println("Nhập số điện thoại");
            sdt = scanner.nextLine();
            ok = (Pattern.compile("^\\d{2}[-]\\d{10}$").matcher(sdt).matches());
            if (ok) {
                System.out.println("số điện thoại Ok");
            } else {
                System.err.println("số điện thoại Okn't");
            }
        } while (!ok);
    }
}
