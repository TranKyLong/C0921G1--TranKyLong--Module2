package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class MinhHoaSapXepChen {
    public static void main(String[] args) {

        int[] numArray = {10, 6, 15, 4, 1, 45};
        System.out.println("Original Array:" + Arrays.toString(numArray));

        for (int i = 1; i < numArray.length ; i++) {
            int temp = numArray[i];
            int position = i - 1;
            while (position >= 0 && temp <= numArray[position]) {
                System.out.println("chèn " +   numArray[position] + " vào vị trí của " +numArray[position + 1] );

                numArray[position + 1] = numArray[position];

                position = position - 1;

            }
            numArray[position + 1] = temp;
            System.out.println(Arrays.toString(numArray));
        }
        //print the sorted array
        System.out.println("Sorted Array:" + Arrays.toString(numArray));
    }
}
