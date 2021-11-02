package ss3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter the student's name here ");
        String studentName = name.nextLine();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)) {
                check = true;
                System.out.println(" Position of the student in list is " + i);
            }
        }
        if (!check) {
            System.out.println("Not found");
        }
    }
}
