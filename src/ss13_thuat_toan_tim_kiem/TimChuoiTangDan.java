package ss13_thuat_toan_tim_kiem;

import sun.text.normalizer.UCharacter;

import java.util.*;

public class TimChuoiTangDan {
    public static void main(String[] args) {
        // Phương thức toCharArray() được sử dụng để chuyển đổi chuỗi thành các mảng ký tự.
        //  Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần sắp xếp");
        String input = scanner.nextLine();
//        String input = "Welcome";
        char[] kyTu = input.toCharArray();
        // Arrays.sort(kyTu);
        // System.out.println(kyTu);

        List<Character> charlist = new ArrayList<>();
        List<Character> subString = new ArrayList<>();

        for (char i : kyTu) {
            charlist.add(i);
        }

        int min;

        for (int i = 0; i < charlist.size(); i++) {
            min = (int) (charlist.get(0));
            if ((int) charlist.get(i) < min) {
                min = (int) charlist.get(i);
                subString.add(charlist.get(i));
                charlist.remove(charlist.get(i));
            } else {
                subString.add(charlist.get(0));
                charlist.remove(charlist.get(0));
            }
        }
        for (int i = 0; i < subString.size(); i++) {
            System.out.println(subString.get(i));
        }
    }
}