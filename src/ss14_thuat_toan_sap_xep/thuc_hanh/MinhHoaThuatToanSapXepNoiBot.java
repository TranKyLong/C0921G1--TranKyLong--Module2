package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinhHoaThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        int[] myList = {17, 90, 51, 68, 15, 92, 47, 38};
        bubbleSortByStep(myList);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {

                    System.out.println("đổi vị trí " + list[i] + " và " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }

            if (!needNextPass) {
                System.out.println("mảng đã được sắp xếp ");
                break;
            }

        }
        /* Show the list after sort */
        System.out.println("mảng sau khi sắp xếp: " + Arrays.toString(list));
    }
}
