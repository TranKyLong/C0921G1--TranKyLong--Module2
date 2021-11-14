package case_study.Services;

import java.util.Scanner;

public class Sub1EmloyeeManagement {
    static boolean check = true;

    static void employeeManagement() {

        int optionFunction1;

        do {
            Scanner choice = new Scanner(System.in);
            System.out.println("+----------EMPLOYEE MANAGEMENT----------+");
            System.out.println("|        1.  Display list employees     |");
            System.out.println("|        2.  Add new employee           |");
            System.out.println("|        3.  Edit employee              |");
            System.out.println("|        4.  Return main menu           |");
            System.out.println("+---------------------------------------+");
            if (check) {
                System.out.println("             PLEASE CHOSE ONE ACTION");

            } else {
                System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");

            }
            optionFunction1 = choice.nextInt();

            if (optionFunction1 < 1 || optionFunction1 > 4) {
                check = false;
                employeeManagement();
            }
            switch (optionFunction1) {
                case 1:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 1              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                    choice.next();
                    check = true;
                    employeeManagement();
                    break;
                case 2:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 2              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                    choice.next();
                    check = true;
                    employeeManagement();
                    break;
                case 3:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 3              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                    choice.next();
                    check = true;
                    employeeManagement();
                    break;
            }
        } while (optionFunction1 != 4);
        check = true;
        Sub0DisplayMenu.displayMenu();
    }
}
