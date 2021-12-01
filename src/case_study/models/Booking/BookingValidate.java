package case_study.models.Booking;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

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
}
