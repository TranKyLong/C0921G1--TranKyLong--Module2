package case_study.Services;

import java.util.Scanner;

public class Sub3FacilityManagement {
    static boolean check = true;

static void facilityManagement() {
        int optionFunction3;
        do {
            Scanner choice = new Scanner(System.in);
            System.out.println("+----------FACILITY MANAGEMENT----------+");
            System.out.println("|        1.  Display list facility      |");
            System.out.println("|        2.  Add new facility           |");
            System.out.println("|        3.  Edit facility maintenance  |");
            System.out.println("|        4.  Return main menu           |");
            System.out.println("+---------------------------------------+");
            if (check) {
                System.out.println("             PLEASE CHOSE ONE ACTION");

            } else {
                System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
            }
            optionFunction3 = choice.nextInt();

            if (optionFunction3 < 1 || optionFunction3 > 4) {
                check = false;
                facilityManagement();

            }
            switch (optionFunction3) {
                case 1:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 1              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                    choice.next();
                    check = true;
                    facilityManagement();
                    break;
                case 2:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 2              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                    choice.next();
                    check = true;
                    facilityManagement();
                    break;
                case 3:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 3              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                    choice.next();
                    check = true;
                    facilityManagement();
                    break;
            }
        } while (optionFunction3 != 4);
        check = true;
        Sub0DisplayMenu.displayMenu();
    }
}
