package ss13_thuat_toan_tim_kiem.bai_tap;

import sun.text.normalizer.UCharacter;

import java.util.*;

public class TimChuoiTangDan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần sắp xếp");
        String input = scanner.nextLine();

        char[] kyTu = input.toCharArray();
        // Arrays.sort(kyTu);

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

        StringBuilder sb = new StringBuilder();
        for (Character ch : subString) {
            sb.append(ch);
        }
        String string = sb.toString();
        System.out.println(string);
    }
}