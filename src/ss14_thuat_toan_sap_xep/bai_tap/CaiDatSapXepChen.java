package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatSapXepChen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int input = Integer.parseInt(scanner.nextLine());
        int[] numArray = new int[input];

        System.out.println("Nhập phần tử mảng");
        for (int i = 0; i < input; i++) {
            numArray[i] = scanner.nextInt();
        }
        insertionSort (numArray);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int position = i - 1;
            while (position >= 0 && current <= list[position]) {
                list[position + 1] = list[position];
                position = position - 1;
            }
            list[position + 1] = current;
        }
        System.out.println("Mảng đã được sắp xếp: " + Arrays.toString(list));
    }
}
