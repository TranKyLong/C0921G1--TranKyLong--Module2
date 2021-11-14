package case_study.Services;

import java.util.Scanner;

public class Sub5PromotionManagement {
    static boolean check = true;

    static void promotionManagement() {
        Scanner choice = new Scanner(System.in);
        int optionFunction5;
        do {
            System.out.println("+----------PROMOTION MANAGEMENT---------+");
            System.out.println("| 1. Display list customers use service |");
            System.out.println("| 2. Display list customers get voucher |");
            System.out.println("| 3. Return main menu                   |");
            System.out.println("+---------------------------------------+");

            if (check) {
                System.out.println("             PLEASE CHOSE ONE ACTION");
            } else {
                System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
            }

            optionFunction5 = choice.nextInt();
            if (optionFunction5 < 1 || optionFunction5 > 3) {
                check = false;
                promotionManagement();
            }

            switch (optionFunction5) {
                case 1:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 1              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN PROMOTION MANAGEMENT");
                    choice.next();
                    check = true;
                    promotionManagement();
                    break;
                case 2:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 2              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN PROMOTION MANAGEMENT");
                    choice.next();
                    check = true;
                    promotionManagement();
                    break;
            }
        } while (optionFunction5 != 3);
        check = true;
        Sub0DisplayMenu.displayMenu();

    }
}
