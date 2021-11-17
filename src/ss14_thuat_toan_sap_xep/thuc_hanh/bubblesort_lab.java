package ss14_thuat_toan_sap_xep.thuc_hanh;

import ss4_lop_va_doi_tuong.thuc_hanh.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort_lab {
    public static void main(String[] args) {
        Integer[] arr = {2,  12, 20, 89, 78, 1};
        int n = arr.length;
        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                    System.out.println(Arrays.toString(arr));
//                }
//            }
//        }
//
//        System.out.println("day 2");

        for (int i = 0; i < n - 1; i++) {
            for (int x = i + 1; x < n - 1; x++) {
                if (arr[x] > arr[i]) {
                    temp = arr[x];
                    arr[x] = arr[i];
                    arr[i] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }



}