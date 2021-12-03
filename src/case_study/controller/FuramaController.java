package case_study.controller;

import case_study.Services.*;
import case_study.Services.impl.*;

import java.util.Scanner;

public class FuramaController implements IController {
    static Scanner scanner = new Scanner(System.in);
    static IPersonServices employee = new EmployeeService();
    static IPersonServices customer = new CustommerServicesImpl();
    static IFacilityServices facility = new FacilityServiceImpl();
    static IBookingServices booking = new BookingServiceImpl();
    static IContractServices contract = new ContractServicesImpl();
    static IPromotionServices promotion = new PromotionServicesImpl();


    public FuramaController() {
    }

    @Override
    public void displayMenu() {
        System.out.println("\n-=MAIN MENU=-");
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
                        System.out.println("\n-=EMPLOYEE MANAGER=-\n"+
                                "1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee\n" +
                                "4.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");
                        int choice1;
                        while (true) {
                            choice1 = Integer.parseInt(scanner.nextLine());
                            try {
                                switch (choice1) {
                                    case 1:
                                        employee.display();
                                        displayMenu();
                                        break;
                                    case 2:
                                        employee.editOrAddNew("Enter new employee code", true);
                                        employee.display();
                                        displayMenu();
                                        break;
                                    case 3:
                                        employee.editOrAddNew("Enter exist employee code", false);
                                        employee.display();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
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
                        System.out.println("\n-=CUSTOMER MANAGER=-\n"+
                                "1. \tDisplay list customers\n" +
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
                                        customer.display();
                                        displayMenu();
                                        break;
                                    case 2:
                                        customer.editOrAddNew("Enter new Customer code", true);
                                        customer.display();
                                        displayMenu();
                                        break;
                                    case 3:
                                        customer.editOrAddNew("Enter exist Customer code", false);
                                        customer.display();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
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
                        System.out.println("\n-=FACILITY MANAGER=-\n"+
                                "1.\tDisplay list facility\n" +
                                "2.\tAdd new facility\n" +
                                "3.\tDisplay list facility maintenance\n" +
                                "4.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice3;
                        while (true) {
                            try {
                                choice3 = Integer.parseInt(scanner.nextLine());
                                switch (choice3) {
                                    case 1:
                                        facility.displayFacility();
                                        displayMenu();
                                        break;
                                    case 2:
                                        addNewFacility();
                                        displayMenu();
                                        break;
                                    case 3:
                                        facility.displayMaintain();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
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
                        System.out.println("\n-=BOOKING MANAGER=-\n"+
                                "1.\tDisplay list booking\n " +
                                "2.\tAdd new booking\n" +
                                "3.\tDisplay list contracts\n" +
                                "4.\tCreate new constracts\n " +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice4;
                        while (true) {
                            try {
                                choice4 = Integer.parseInt(scanner.nextLine());
                                switch (choice4) {
                                    case 1:
                                        booking.displayBookingFile();
                                        displayMenu();
                                        break;
                                    case 2:
                                        booking.addBooking();
                                        displayMenu();
                                        break;
                                    case 3:
                                        contract.displayContract();
                                        displayMenu();
                                        break;
                                    case 4:
                                        contract.addContract();
                                        displayMenu();
                                        break;
                                    case 5:
                                        contract.editContract();
                                        contract.displayContract();
                                        displayMenu();
                                        break;
                                    case 6:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
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
                        System.out.println("\n-=PROMOTION MANAGER=-\n"+
                                "1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tAdd new voucher\n" +
                                "4.\tReturn main menu\n" +
                                "Enter a number that matches the menu function");

                        int choice6;
                        while (true) {
                            try {
                                choice6 = Integer.parseInt(scanner.nextLine());
                                switch (choice6) {
                                    case 1:
                                        promotion.displayCustommerList();
                                        displayMenu();
                                        break;
                                    case 2:
                                        promotion.showCustomerGetVoucher();
                                        displayMenu();
                                        break;
                                    case 3:
                                        promotion.voucherAdder();
                                        displayMenu();
                                        break;
                                    case 4:
                                        System.out.println("Return to main menu");
                                        displayMenu();
                                        break;
                                    default:
                                        System.err.println("Please enter the correct number");
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
                        System.err.println("Please enter the correct number");
                        displayMenu();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Exception: The entered character is not a number");
                displayMenu();
            }
        }

    }

    private static void addNewFacility() {
        System.out.println("\n-=UPDATE FACILITY=-\n"+
                "1 .\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu");
        System.out.println("Enter a number that matches the menu function");
        int choiceToAdd = Integer.parseInt(scanner.nextLine());
        while (true) {
            try {
                switch (choiceToAdd) {
                    case 1:
                        facility.getNewHouse();
                        facility.displayFacility();
                        addNewFacility();
                        break;
                    case 2:
                        facility.getNewRoom();
                        facility.displayFacility();
                        addNewFacility();
                        break;
                    case 3:
                        facility.getNewVilla();
                        facility.displayFacility();
                        addNewFacility();

                        break;
                    case 4:
                        System.out.println("Return facility manager");
                        break;
                    default:
                        System.err.println("Please enter the correct number");
                        IController menu = new FuramaController();
                        menu.displayMenu();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Exception: The entered character is not a number");
            }

        }
    }
}