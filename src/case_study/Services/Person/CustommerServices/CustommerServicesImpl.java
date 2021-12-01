package case_study.Services.Person.CustommerServices;

import case_study.Services.GeneralMethod;
import case_study.Services.Person.GerenalMethodPerson;
import case_study.controller.FuramaController;
import case_study.models.khach_hang_va_nhan_vien.Customer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustommerServicesImpl implements ICustommerServices {
    public static final String CUSTOMMER = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\custommer.csv";
    static Scanner scanner = new Scanner((System.in));
    static List<Customer> customerList = new LinkedList<>();

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
            GeneralMethod.writFile(i, CUSTOMMER);
        }
    }

    @Override
    public void displayCustommer() {
        for ( String i: GeneralMethod.readFileCsv(CUSTOMMER)
             ) {
            System.out.println(i.replace(",","\t \t"));
        }


    }

    @Override
    public Customer getNewCustommer() {
        Customer myCustommer = null;
        GerenalMethodPerson.getPerson(myCustommer);

        System.out.println("Enter Custommer code");
        String code = null;
        do {
            code = scanner.nextLine();
        } while (CustommerValidate.isCustommerExist(code) != null || code == null);
        myCustommer.setCustommerCode(code);

        System.out.println("Enter adress");
        myCustommer.setAdress(scanner.nextLine());

        myCustommer.setCustommerType(CustommerValidate.pickCustommerType());
        return myCustommer;
    }

    @Override
    public void editOrAddNewCustommer(String sign) {
        displayCustommer();
        System.out.println(sign);
        Customer theCustommer = CustommerValidate.isCustommerExist(scanner.nextLine());
        if (theCustommer != null) {
            System.out.println("This code already exist, do you want edit this Custommer\n" +
                    "               [ 1. YES / 2.NO ] ?");
            while (true) {
                try {
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            getNewCustommer();
                            customerList.set(customerList.indexOf(theCustommer), getNewCustommer());
                            break;
                        case 2:
                            FuramaController.displayMenu();
                        default:
                            System.err.println("Please enter available number");
                            editOrAddNewCustommer(sign);
                            break;
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Please enter a number");
                }
            }
        } else {
            customerList.add(getNewCustommer());
            System.out.println("Sucess");
        }
    }


    public static void main(String[] args) {
        writeToCsv();
        CustommerServicesImpl m = new CustommerServicesImpl();
        m.displayCustommer();
    }
}
