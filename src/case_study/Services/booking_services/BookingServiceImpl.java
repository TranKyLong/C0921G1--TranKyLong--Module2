package case_study.Services.booking_services;

import case_study.Services.ReadWrite;
import case_study.Services.Person.CustommerServices.CustommerServicesImpl;
import case_study.Services.Person.CustommerServices.ICustommerServices;
import case_study.Services.facility.FacilityServiceImpl;
import case_study.models.booking_contract.Booking;
import case_study.models.co_so_vat_chat.Facility;
import case_study.models.co_so_vat_chat.House;
import case_study.models.co_so_vat_chat.Villa;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import static case_study.Services.facility.FacilityServiceImpl.facilityMap;

public class BookingServiceImpl {
    public static final String BOOKING_FILE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\booking.csv";
    public static Set<Booking> bookingSet = new TreeSet<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        bookingSet.add(new Booking(LocalDate.of(2021, 2, 1), LocalDate.of(2021, 2, 5), "1509", "0123", "Name", "Villa", "SVVL-9234"));
        bookingSet.add(new Booking(LocalDate.of(2021, 3, 15), LocalDate.of(2021, 3, 1), "1509", "0123", "Name", "Villa", "SVVL-8234"));
        bookingSet.add(new Booking(LocalDate.of(2021, 4, 1), LocalDate.of(2021, 5, 7), "1509", "0123", "Name", "Villa", "SVVL-6234"));
        bookingSet.add(new Booking(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 11), "1509", "0123", "Name", "House", "SVHO-3234"));
    }

    public static List<String> getServicesInfo(String sign) {
        List<String> info = new ArrayList<>();
        int count = 0;
        String input = null;
        while (true) {
            try {
                System.out.println(sign);
                input = scanner.nextLine();
                for (Map.Entry<Facility, Integer> entry : facilityMap.entrySet()) {
                    if ((entry.getKey().getSerivesCode()).equals(input)) {
                        facilityMap.put(entry.getKey(), entry.getValue() + 1);
                        count++;
                        info.add(entry.getKey().getSerivesCode());
                        info.add(entry.getKey().getTenDichVu());

                        if (entry.getKey() instanceof Villa) {
                            info.add("Villa");
                        } else if (entry.getKey() instanceof House) {
                            info.add("House");
                        } else {
                            info.add("Room");
                        }
                    }
                }
                if (count >= 1) {
                    break;
                } else throw new IllegalArgumentException();

            } catch (IllegalArgumentException e) {
                System.err.println("Invalid code!");
            } catch (Exception e) {
                System.err.println("Please try again");
            }
        }
        return info;
    }

    public static void getNewBooking() {
        System.out.println("-=SERVICES=-");
        FacilityServiceImpl.displayFacility();

        System.out.println("\n-=CUSTOMMER=-");
        ICustommerServices custom = new CustommerServicesImpl();
        custom.displayCustommer();

        Booking myBooking = new Booking();
        List<String> info = getServicesInfo("Enter existing services code");

        myBooking.setCustommerCode(BookingValidate.isExistCustommerCode("Enter existing custommer code"));
        myBooking.setSerivicesCode(info.get(0));
        myBooking.setServicesName(info.get(1));
        myBooking.setServicesType(info.get(2));
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
            ReadWrite.writFile(i, BOOKING_FILE);
        }
    }

    public static void display() {
        for (String i : ReadWrite.readFileCsv(BOOKING_FILE)) {
            System.out.println(i);
        }
    }
}
