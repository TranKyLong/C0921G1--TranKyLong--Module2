package ss14_thuat_toan_sap_xep.thuc_hanh;

import ss4_lop_va_doi_tuong.thuc_hanh.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort_lab {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        int swap = 0;
        int loop = 0;
        int loopout = 0;

        int swap2 = 0;
        int loop2 = 0;
        int loopout2 = 0;

        int swap3 = 0;
        int loop3 = 0;
        int loopout3 = 0;

        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) { // LOW BOOK CHOICE
            for (int x = i + 1; x < n; x++) {
                if (arr[x] < arr[i]) {
                    temp = arr[x];
                    arr[x] = arr[i];
                    arr[i] = temp;
                    swap++;
                    System.out.println(Arrays.toString(arr));
                }
                loop++;
            }
            loopout++;
        }

        System.out.println("loop =" + loop);
        System.out.println("loopout =" + loopout);
        System.out.println("swap = " + swap);

        boolean needNextPass = true; //NOT A CHOICE, NOPE
        for (int k = 1; k < arr.length && needNextPass; k++) {
            /* Array may be sorted and next pass not needed */
            needNextPass = false;
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    needNextPass = true; /* Next pass still needed */
                    swap2++;
                }
                loop2++;
            }
            loopout2++;
        }
        System.out.println("loop2 =" + loop2);
        System.out.println("loopout2 =" + loopout2);
        System.out.println("swap2 = " + swap2);


        int dai = arr.length; //BEST CHOICE
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap3++;

                }
                loop++;
            }
            loop3++;
        }
        System.out.println("\n\n\nloop3: " + loop3);
        System.out.println("loopout3:  " + loopout3);
        System.out.println("loopswap3:  " + swap3);

    }
}