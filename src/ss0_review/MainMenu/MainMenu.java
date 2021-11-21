package ss0_review.MainMenu;

import ss0_review.controller.CandidateController;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void choiceMenu() {
        try {
            System.out.println("Nhập số tương ứng với chức năng");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    CandidateController.creatExperience();
                    break;
                case 2:
                    CandidateController.creatFresher();
                    break;
                case 3:
                    CandidateController.creatIntership();
                    break;
                case 4:
                    CandidateController.searching();
                    break;
                case 5:
                    System.out.println("kết thức chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại giá trị đúng");
                    choiceMenu();
                    break;

            }
        }catch (Exception e){
            System.err.println("Lỗi, mời nhập lại");
            choiceMenu();
        }
    }
}
