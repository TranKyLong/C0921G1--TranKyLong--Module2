package ss4_lop_va_doi_tuong.bai_tap.StopWatch;

import java.util.Arrays;

public class MainOfStopWatch {
    public static void main(String[] args) {
        StopWatch newWatch = new StopWatch();

        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 150000);
        }

        newWatch.getStart();
        System.out.println(newWatch.getStart());
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        newWatch.getEnd();
        System.out.println(newWatch.getEnd());
        System.out.println(newWatch.getElapsedTime());

    }
}
