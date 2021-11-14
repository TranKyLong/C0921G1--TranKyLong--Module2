package case_study.Services;

import java.util.Scanner;

public class Sub4Booking {
    static boolean check = true;

    static void bookingManagement() {
        Scanner choice = new Scanner(System.in);
        int optionFunction4;
        do {
            System.out.println("+-----------BOOKING MANAGEMENT----------+");
            System.out.println("|        1. Add new booking             |");
            System.out.println("|        2. Display list booking        |");
            System.out.println("|        3. Create new constracts       |");
            System.out.println("|        4. Display list contracts      |");
            System.out.println("|        5. Edit contracts              |");
            System.out.println("|        6. Return main menu            |");
            System.out.println("+---------------------------------------+");
            if (check) {
                System.out.println("             PLEASE CHOSE ONE ACTION");
            } else {
                System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
            }
            optionFunction4 = choice.nextInt();
            if (optionFunction4 < 1 || optionFunction4 > 6) {
                choice.next();
                check = true;
                bookingManagement();

            }
            switch (optionFunction4) {
                case 1:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 1              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                    choice.next();
                    check = true;
                    bookingManagement();
                    break;
                case 2:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 2              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                    choice.next();
                    check = true;
                    bookingManagement();
                    break;
                case 3:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 3              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                    choice.next();
                    check = true;
                    bookingManagement();
                    break;
                case 4:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 4              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                    choice.next();
                    check = true;
                    bookingManagement();
                    break;
                case 5:
                    System.out.println("+---------------------------------------+");
                    System.out.println("|                 ACTION 5              |");
                    System.out.println("|               IS COMPLETED            |");
                    System.out.println("+---------------------------------------+");
                    System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                    choice.next();
                    check = true;
                    bookingManagement();
                    break;
            }
        } while (optionFunction4 != 6);
        check = true;
        Sub0DisplayMenu.displayMenu();
    }
}
