package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println(" -------------------MENU------------------------");
        System.out.println(" ---- Chọn số tương ứng để hiển thị hình vẽ ----");
        System.out.println(" ---- 1/ Hiển thị hình chữ nhật             ----");
        System.out.println(" ---- 2/ Hiển thị hình tam giác vuông       ----");
        System.out.println(" ---- 3/ Hiển thị hình tam giác cân         ----");
        System.out.println(" ---- 4/ Thoát chương trình                 ----");
        System.out.println(" -----------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int high = 8;
        int width = 14;
        switch (option) {
            case 1:
                for (int i = 0; i < high; i++) {
                    for (int x = 0; x < width; x++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println(" ---- Chọn vị trí góc vuông của tam giác ----");
                System.out.println(" ---- 1/ Góc vuông ở bên trái phía dưới  ----");
                System.out.println(" ---- 2/ Góc vuông ở bên trái phía trên  ----");
                System.out.println(" ---- 3/ Góc vuông ở bên phải phía dưới  ----");
                System.out.println(" ---- 4/ Góc vuông ở bên phải phía trên  ----");
                System.out.println(" ---- 5/             Thoát               ----");
                System.out.println(" --------------------------------------------");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        for (int i = 0; i < high; i++) {
                            for (int x = 0; x < i; x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < high; i++) {
                            for (int x = 0; x < (high - i); x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < high; i++) {

                            for (int x = 0; x < (high - i); x++) {
                                System.out.print(" ");
                            }
                            for (int x = 0; x < i; x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        for (int i = 0; i < high; i++) {
                            for (int x = 0; x < i; x++) {
                                System.out.print("  ");
                            }
                            for (int x = 0; x < (high - i); x++) {
                                System.out.print(" *");
                            }
                            System.out.println("");
                        }
                        break;
                    case 5:
                        break;
                }
                break;


            case 3:
                for (int i = 0; i <= high; i++) {
                    for (int q = high; q > i; q--) {
                        System.out.print("  ");
                    }
                    for (int x = 1; x <= i * 2 - 1; x++) {
                        System.out.print(" *");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                break;
        }
    }
}
