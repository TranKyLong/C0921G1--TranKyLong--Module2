package case_study.Services.booking_services;

import case_study.models.khach_hang_va_nhan_vien.Customer;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

import static case_study.Services.Person.CustommerServices.CustommerServicesImpl.customerList;

public class BookingValidate {
    static Scanner scanner = new Scanner(System.in);

    public static LocalDate validateDayTime(String sign) {
        LocalDate day = null;
        while (true) {
            try {
                System.out.println(sign);
                day = LocalDate.parse(scanner.nextLine());

                break;
            } catch (DateTimeException e) {
                System.err.println("wrong date and time format!");
            }
        }
        return day;
    }

    public static String isExistCustommerCode(String sign) {
        String input = null;
        while (true){
            System.out.println(sign);
            try {
                input = scanner.nextLine();
                for (Customer i: customerList) {
                    if (i.getCustommerCode().equals(input)) {
                        return input;
                    }
                }
               throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.err.println(" Invalid customer code ");
            }
        }
    }


}
