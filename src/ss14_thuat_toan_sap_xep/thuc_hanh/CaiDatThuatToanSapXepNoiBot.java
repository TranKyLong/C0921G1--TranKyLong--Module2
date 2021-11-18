package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class CaiDatThuatToanSapXepNoiBot {
    public static void main(String[] args) {
        int[] myList = {35, 5, 34, 68, 21, 16, 26, 91, 37, 8, 60, 88, 86, 41, 26};
        bubbleSort(myList);
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        int doDai = arr.length;
        for (int i = 0; i < doDai - 1; i++) {
            for (int x = 0; x < doDai - i - 1; x++) {
                if (arr[x] > arr[x + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        System.out.println("Mảng đã được sắp xếp tăng dần: " + Arrays.toString(arr));
    }
}
