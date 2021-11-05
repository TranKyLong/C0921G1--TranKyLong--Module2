package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        FuramaMethod.displayMenu();
    }

    static class FuramaMethod {
        private static int count = 0;

        public static void displayMenu() {
            int option;

            Scanner choice = new Scanner(System.in);
            System.out.println("+--------------DISPLAY MENU-------------+");
            System.out.println("|        1.  Employee  Management       |");
            System.out.println("|        2.  Customer  Management       |");
            System.out.println("|        3.  Facility  Management       |");
            System.out.println("|        4.  Booking   Management       |");
            System.out.println("|        5.  Promotion Management       |");
            System.out.println("|        6.  Exit                       |");
            System.out.println("+---------------------------------------+");
            if (count < 0) {
                System.out.println("THE NUMBER YOU ENTER IS INVALID, PLEASE RE-ENTER A NUMBER");
            } else {
                System.out.println("             PLEASE ENTER A NUMBER");
            }
            option = choice.nextInt();
            if (option < 1 || option > 6) {
                count=-1;
                displayMenu();
            }
            count = 0;
            switch (option) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    FuramaMethod.facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.out.println("THANKS FOR USE OUR SERVICES");
                    break;

            }
        }

        private static void employeeManagement() {
            int optionFunction1;
            do {
                Scanner choice = new Scanner(System.in);
                System.out.println("+----------EMPLOYEE MANAGEMENT----------+");
                System.out.println("|        1.  Display list employees     |");
                System.out.println("|        2.  Add new employee           |");
                System.out.println("|        3.  Edit employee              |");
                System.out.println("|        4.  Return main menu           |");
                System.out.println("+---------------------------------------+");
                if (count < 0) {
                    System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
                } else {
                    System.out.println("             PLEASE CHOSE ONE ACTION");
                    count = 0;
                }
                optionFunction1 = choice.nextInt();

                if (optionFunction1 < 1 || optionFunction1 > 4) {
                    count = -1;
                    employeeManagement();
                }
                switch (optionFunction1) {
                    case 1:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 1              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                        char text = choice.next().charAt(0);
                        employeeManagement();
                        break;
                    case 2:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 2              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                        text = choice.next().charAt(0);
                        employeeManagement();
                        break;
                    case 3:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 3              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN EMPLOYEE MANAGEMENT");
                        text = choice.next().charAt(0);
                        employeeManagement();
                        break;
                }
            } while (optionFunction1 != 4);
            count = 0;
            displayMenu();
        }

        private static void customerManagement() {
            int optionFunction2;
            Scanner choice = new Scanner(System.in);
            do {
                System.out.println("+----------CUSTOMER MANAGERMENT---------+");
                System.out.println("|        1.  Display list customers     |");
                System.out.println("|        2.  Add new customer           |");
                System.out.println("|        3.  Edit customer              |");
                System.out.println("|        4.  Return main menu           |");
                System.out.println("+---------------------------------------+");

                if (count < 0) {
                    System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
                } else {
                    System.out.println("             PLEASE CHOSE ONE ACTION");
                }
                optionFunction2 = choice.nextInt();

                if (optionFunction2 < 1 || optionFunction2 > 4) {
                    count = -1;
                    customerManagement();
                    count = 0;
                }
                switch (optionFunction2) {
                    case 1:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 1              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                        char text = choice.next().charAt(0);
                        customerManagement();
                        break;
                    case 2:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 2              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                        text = choice.next().charAt(0);
                        customerManagement();
                        break;
                    case 3:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 3              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN CUSTOMER MANAGEMENT");
                        text = choice.next().charAt(0);
                        customerManagement();
                        break;
                }
            } while (optionFunction2 != 4);
            count = 0;
            displayMenu();
        }

        private static void facilityManagement() {
            int optionFunction3;
            do {
                Scanner choice = new Scanner(System.in);
                System.out.println("+----------FACILITY MANAGEMENT----------+");
                System.out.println("|        1.  Display list facility      |");
                System.out.println("|        2.  Add new facility           |");
                System.out.println("|        3.  Edit facility maintenance  |");
                System.out.println("|        4.  Return main menu           |");
                System.out.println("+---------------------------------------+");
                if (count < 0) {
                    System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
                } else {
                    System.out.println("             PLEASE CHOSE ONE ACTION");
                }
                optionFunction3 = choice.nextInt();

                if (optionFunction3 < 1 || optionFunction3 > 4) {
                    count = -1;
                    facilityManagement();
                    count = 0;
                }
                switch (optionFunction3) {
                    case 1:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 1              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                        char text = choice.next().charAt(0);
                        facilityManagement();
                        break;
                    case 2:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 2              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                        text = choice.next().charAt(0);
                        facilityManagement();
                        break;
                    case 3:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 3              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN FACILITY MANAGEMENT");
                        text = choice.next().charAt(0);
                        facilityManagement();
                        break;
                }
            } while (optionFunction3 != 4);
            count = 0;
            displayMenu();
        }

        private static void bookingManagement() {
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
                if (count < 0) {
                    System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
                } else {
                    System.out.println("             PLEASE CHOSE ONE ACTION");
                }
                optionFunction4 = choice.nextInt();
                if (optionFunction4 < 1 || optionFunction4 > 6) {
                    count = -1;
                    bookingManagement();
                    count = 0;
                }
                switch (optionFunction4) {
                    case 1:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 1              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                        char text = choice.next().charAt(0);
                        bookingManagement();
                        break;
                    case 2:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 2              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                        text = choice.next().charAt(0);
                        bookingManagement();
                        break;
                    case 3:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 3              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                        text = choice.next().charAt(0);
                        bookingManagement();
                        break;
                    case 4:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 4              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                        text = choice.next().charAt(0);
                        bookingManagement();
                        break;
                    case 5:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 5              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN BOOKING MANAGEMENT");
                        text = choice.next().charAt(0);
                        bookingManagement();
                        break;
                }
            } while (optionFunction4 != 6);
            count = 0;
            displayMenu();
        }

        private static void promotionManagement() {
            Scanner choice = new Scanner(System.in);
            int optionFunction5;
            do {
                System.out.println("+----------PROMOTION MANAGEMENT---------+");
                System.out.println("| 1. Display list customers use service |");
                System.out.println("| 2. Display list customers get voucher |");
                System.out.println("| 3. Return main menu                   |");
                System.out.println("+---------------------------------------+");

                optionFunction5 = choice.nextInt();
                if (optionFunction5 < 1 || optionFunction5 > 3) {
                    count=-1;
                    promotionManagement();
                    count=0;
                }
                if (count < 0) {
                    System.out.println("THE NUMBER YOU ENTER IS NOT VALID, PLEASE RE-ENTER A NUMBER");
                } else {
                    System.out.println("             PLEASE CHOSE ONE ACTION");
                }
                switch (optionFunction5) {
                    case 1:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 1              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN PROMOTION MANAGEMENT");
                        char text = choice.next().charAt(0);
                        promotionManagement();
                        break;
                    case 2:
                        System.out.println("+---------------------------------------+");
                        System.out.println("|                 ACTION 2              |");
                        System.out.println("|               IS COMPLETED            |");
                        System.out.println("+---------------------------------------+");
                        System.out.println("PRESS ANY KEY TO RETURN PROMOTION MANAGEMENT");
                        text = choice.next().charAt(0);
                        promotionManagement();
                        break;
                }
            } while (optionFunction5 != 3);
            count = 0;
            displayMenu();

        }
    }
}
