package case_study.view;

import case_study.controller.FuramaController;
import case_study.controller.IController;

public class Menu {
    public static void main(String[] args) {
        IController mainMenu = new FuramaController();
        mainMenu.displayMenu();
    }
}
