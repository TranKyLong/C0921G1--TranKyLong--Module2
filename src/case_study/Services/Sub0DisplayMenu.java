package case_study.Services;

import java.util.Scanner;

public class Sub0DisplayMenu {

    private static boolean check = true;

    public static void displayMenu() {
        Scanner choice = new Scanner(System.in);
        System.out.println("+--------------DISPLAY MENU-------------+");
        System.out.println("|        1.  Employee  Management       |");
        System.out.println("|        2.  Customer  Management       |");
        System.out.println("|        3.  Facility  Management       |");
        System.out.println("|        4.  Booking   Management       |");
        System.out.println("|        5.  Promotion Management       |");
        System.out.println("|        6.  Exit                       |");
        System.out.println("+---------------------------------------+");
        if (!check) {
            System.out.println("THE NUMBER YOU ENTER IS INVALID, PLEASE RE-ENTER A NUMBER");
        } else {
            System.out.println("             PLEASE ENTER A NUMBER");
        }

        try {
            int option = choice.nextInt();
            if (option < 1 || option > 6) {
                check = false;
                displayMenu();
            }

            switch (option) {
                case 1:
                    check = true;
                    Sub1EmloyeeManagement.employeeManagement();
                    break;
                case 2:
                    Sub2CustomerManagement.customerManagement();
                    break;
                case 3:
                    Sub3FacilityManagement.facilityManagement();
                    break;
                case 4:
                    Sub4Booking.bookingManagement();
                    break;
                case 5:
                    Sub5PromotionManagement.promotionManagement();
                    break;
            }
            if (option == 6) {
                System.out.println("THANKS FOR USE OUR SERVICES");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("security staff will come if you enter non-numeric characters again, be careful");
            displayMenu();
        }
    }

}



