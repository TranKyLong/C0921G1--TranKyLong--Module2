package case_study.models.Booking;

import case_study.models.Customer;
import case_study.models.Person;

import java.util.Scanner;

public class CreatCustomer {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        Customer customer1 = new Customer();

        System.out.println("Enter customer name ");
        ((Person) customer1).setFullName(scaner.nextLine());

        System.out.println("Enter customer age ");
        ((Person) customer1).setAge(Integer.parseInt(scaner.nextLine()));

        System.out.println("Enter customer gender ");
        ((Person) customer1).setGender(scaner.nextLine());

        System.out.println("Enter customer phone number ");
        ((Person) customer1).setPhone(scaner.nextLine());

        System.out.println("Vip cusstomer?");
        customer1.setVip(scaner.nextBoolean());


        System.out.format("%-15s %-15s %-15s %-15s %-15s \n",
                "FULL NAME",
                "AGE",
                "GENDER",
                "PHONE NUMBER",
                "VIP");

        System.out.format("%-15s %-15s %-15s %-15s %-15s \n",
                customer1.getFullName(),
                customer1.getAge(),
                customer1.getGender(),
                customer1.getPhone(),
                customer1.isVip());
    }


}
