package ss0_review.view;

import ss0_review.MainMenu.MainMenu;

public class Menu {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                "1.\tThêm ứng viên Experience\n" +
                "2.\tThêm ứng viên Fresher\n" +
                "3.\tThêm ứng viên Internship\n" +
                "4.\tSearching\n" +
                "5.\tExit\n");
        MainMenu.choiceMenu();
    }
}
