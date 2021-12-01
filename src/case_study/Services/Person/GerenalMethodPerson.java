package case_study.Services.Person;

import case_study.models.khach_hang_va_nhan_vien.PersonFurama;

import java.util.Scanner;

public class GerenalMethodPerson {
static Scanner scanner = new Scanner(System.in);
    public static PersonFurama getPerson(PersonFurama person) {

        System.out.println("Enter name");
        person.setName(scanner.nextLine());

        System.out.println("Enter birthday");
        person.setBirthDay(scanner.nextLine());

        System.out.println("Enter gender");
        person.setGender(scanner.nextLine());

        System.out.println("Enter the citizen identification number");
        person.setCmnd(scanner.nextLine());

        System.out.println("Enter phone");
        person.setPhone(scanner.nextLine());

        System.out.println("Enter mail");
        person.setEmail(scanner.nextLine());

        return person;
    }
}
