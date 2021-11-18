package ss13_thuat_toan_tim_kiem.bai_tap;
import java.util.*;
public class TimChuoiTangDan {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Nhập chuỗi: ");
            String myString = input.nextLine();

            List<Character> max = new LinkedList<>();

            for (int i = 0; i < myString.length(); i++) {
                LinkedList<Character> myList = new LinkedList<>();
                myList.add(myString.charAt(i));
                for (int j = i + 1; j < myString.length(); j++) {
                    if (myString.charAt(j) > myList.getLast()) {
                        myList.add(myString.charAt(j));
                    }
                }
                if (myList.size() > max.size()) {
                    max.clear();
                    max.addAll(myList);
                }
                myList.clear();
            }
            for (Character ch : max) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
