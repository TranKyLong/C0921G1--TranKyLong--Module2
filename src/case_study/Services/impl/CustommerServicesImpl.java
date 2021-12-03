package case_study.Services.impl;

import case_study.Services.IPersonServices;
import case_study.models.Customer;
import case_study.utils.ReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustommerServicesImpl implements IPersonServices {
    public static final String CUSTOMMER = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\custommer.csv";
    static Scanner scanner = new Scanner((System.in));
    public static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer("Name1", "15/5/1995", "nam", "111111111", "09122222", "01@gmail.com", "150", "adress1", "Diamond"));
        customerList.add(new Customer("Name122", "15/5/199522", "nam", "2222222222", "22", "02@gmail.com", "251", "adress2", "Platinium"));
    }

    public static void writeToCsv() {
        try {
            new FileWriter(CUSTOMMER, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Customer i : customerList) {
            ReadWrite.writFile(i, CUSTOMMER);
        }
    }

    @Override
    public void display() {
        for (String i : ReadWrite.readFileCsv(CUSTOMMER)) {
            System.out.println(i.replace(",", "\t \t"));
        }
    }

    private static Customer getNewCustommer(boolean addNew) {
        Customer myCustommer = new Customer();
        GerenalMethodPerson.getPerson(myCustommer);

        if (!addNew) {
            System.out.println("Enter Custommer code");
            String code = null;
            do {
                code = scanner.nextLine();
            } while (Validate.isCustommerExist(code) != null || code == null);
            myCustommer.setCustommerCode(code);
        }


        System.out.println("Enter adress");
        myCustommer.setAdress(scanner.nextLine());

        myCustommer.setCustommerType(pickCustommerType());
        return myCustommer;
    }

    @Override
    public void editOrAddNew(String sign, boolean addNew) {
        display();
        System.out.println(sign);
        String idCode = scanner.nextLine();
        Customer theCustommer = Validate.isCustommerExist(idCode);
        if (theCustommer != null && addNew) {
            System.out.println("This code already exist, do you want edit this Customer\n" +
                    "                        [ 1. YES / 2.NO ] ?");
            while (true) {
                try {
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        customerList.set(customerList.indexOf(theCustommer), getNewCustommer(false));
                        writeToCsv();
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Please enter a number");
                }
            }
        } else {
            if (!addNew) {
                System.out.println("This code not already exist, switch to adding mode");
            }
            Customer addNewCustomer =getNewCustommer(true);
            addNewCustomer.setCustommerCode(idCode);
            customerList.add(addNewCustomer);
            writeToCsv();
            System.out.println("Sucess");
        }
    }

    static private String pickCustommerType() {
        while (true) {
            try {
                System.out.println("Enter one type for Custommer\n"
                        + "1. Diamond\n"
                        + "2. Platinium\n"
                        + "3. Gold\n"
                        + "4. Silver\n"
                        + "5. Member\n");
                int enterType = Integer.parseInt(scanner.nextLine());
                switch (enterType) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinium";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
                    default:
                        System.err.println("Out of choice avaiable");
                        pickCustommerType();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            }
        }
        return null;
    }
}
