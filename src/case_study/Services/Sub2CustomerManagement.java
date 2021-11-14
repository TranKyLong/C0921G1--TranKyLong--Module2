package case_study.Services;

import java.util.Scanner;

public class Sub2CustomerManagement {
    static boolean check = true;

    static void customerManagement() {

        int optionFunction2;

        do {
            Scanner choice = new Scanner(System.in);
            System.out.println("+----------CUSTOMER MANAGERMENT---------+");
            System.out.println("|        1.  Display list customers     |");
            System.out.println("|        2.  Add new customer           |");
            System.out.println("|        3.  Edit customer              |");
            System.out.println("|        4.  Return main menu           |");
            System.out.println("+---------------------------------------+");
            if (check) {
                System.out.println("             PLEASE CHOSE ONE ACTION");
            } else {
                System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
            }
            optionFunction2 = choice.nextInt();

            if (optionFunction2 < 1 || optionFunction2 > 4) {
                check = false;
                customerManagement();
            }
            switch (optionFunction2) {
                case 1:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 1              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                    choice.next();
                    check = true;
                    customerManagement();
                    break;
                case 2:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 2              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                    choice.next();
                    check = true;
                    customerManagement();
                    break;
                case 3:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 3              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                    choice.next();
                    check = true;
                    customerManagement();
                    break;
            }
        } while (optionFunction2 != 4);
        check = true;
        Sub0DisplayMenu.displayMenu();
    }
}
