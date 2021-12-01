package case_study.Services.booking_services;

import case_study.Services.GeneralMethod;
import case_study.models.Booking.Booking;
import case_study.models.Booking.BookingValidate;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl {
    public static final String BOOKING_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\booking.csv";
    static Set<Booking> bookingSet = new TreeSet<>();

    static {
        bookingSet.add(new Booking(LocalDate.of(2021, 2, 1), LocalDate.of(2021, 2, 5)));
        bookingSet.add(new Booking(LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 1)));
        bookingSet.add(new Booking(LocalDate.of(2021, 4, 1), LocalDate.of(2021, 5, 7)));
        bookingSet.add(new Booking(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 11)));
    }

    public static void getNewBooking() {
        Booking myBooking = new Booking();
        myBooking.setBookingTime(BookingValidate.validateDayTime("Enter your booking date (follow the format yyyy-mm-dd)"));
        myBooking.setCheckOut(BookingValidate.validateDayTime("Enter your check out date (follow the format yyyy-mm-dd)"));
        bookingSet.add(myBooking);
        writeToCsv();

    }

    public static void writeToCsv() {
        try {
            new FileWriter(BOOKING_FILE, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Booking i : bookingSet) {
            GeneralMethod.writFile(i, BOOKING_FILE);
        }
    }

    public static void display() {
        for (String i : GeneralMethod.readFileCsv(BOOKING_FILE)) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        writeToCsv();
        display();
    }
}
