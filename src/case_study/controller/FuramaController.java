package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);

    public FuramaController() {
    }
    public void displayMenu() {
        System.out.println("1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n" +
                "Enter a number that matches the menu function");

        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice1;
                        while (true) {
                            try {
                                choice1 = Integer.parseInt(scanner.nextLine());
                                switch (choice1) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n+" +
                                "Enter a number that matches the menu function");

                        int choice2;
                        while (true) {
                            try {
                                choice2 = Integer.parseInt(scanner.nextLine());
                                switch (choice2) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice3;
                        while (true) {
                            try {
                                choice3 = Integer.parseInt(scanner.nextLine());
                                switch (choice3) {
                                    case 1:
                                        break;
                                    case 2:
                                        System.out.println("1 .\tAdd New Villa\n" +
                                                "2 .\tAdd New House\n" +
                                                "3 .\tAdd New Room\n" +
                                                "4 .\tBack to menu");
                                        System.out.println("Enter a number that matches the menu function");
                                        int choiceToAdd = Integer.parseInt(scanner.nextLine());
                                        while (true) {
                                            try {
                                                switch (choiceToAdd) {
                                                    case 1:
                                                        break;
                                                    case 2:
                                                        break;
                                                    case 3:
                                                        System.out.println();
                                                        break;
                                                    case 4:
                                                        break;
                                                    default:
                                                        displayMenu();
                                                        break;
                                                }
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.err.println("Exception: The entered character is not a number");
                                            }
                                        }
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new constracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice4;
                        while (true) {
                            try {
                                choice4 = Integer.parseInt(scanner.nextLine());
                                switch (choice4) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }

                        break;
                    case 5:
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice6;
                        while (true) {
                            try {
                                choice6 = Integer.parseInt(scanner.nextLine());
                                switch (choice6) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        displayMenu();
                                        break;
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.err.println("Exception: The entered character is not a number");
                            }
                        }
                        break;
                    case 6:
                        break;
                    default:
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Exception: The entered character is not a number");
            }
        }

    }

    private static void employeeManage() {

    }

    private static void customerManage() {

    }

    private static void facilityManage() {

    }

    private static void addNewfacility() {

    }

    private static void bookingManage() {

    }

    private static void promotionManage() {

    }
}