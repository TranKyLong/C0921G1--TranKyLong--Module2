package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TenLopHoc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String className;
        boolean ok;
        do {
            System.out.println("Nhập tên lớp học");
            //tên đúng C0318G
            //tên sai  M0318G, P0323A
            className = scanner.nextLine();
            ok = (Pattern.compile("^[CAP][\\d]{4}[GHIKLM]$").matcher(className).matches());
            if (ok) {
                System.out.println("TÊN LỚP Ok");
            } else {
                System.err.println("TÊN LỚP Okn't");
            }
        } while (!ok);
    }

}
