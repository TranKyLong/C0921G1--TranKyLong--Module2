package case_study.Services.impl;

import case_study.models.Facility;

import java.util.Scanner;

public class GeneralMethodFacility {
    static Scanner scanner = new Scanner(System.in);

    public static Facility getFacility(Facility facility) {

        String name = Validate.FacilityValidate.validateInput("Enter services name", "name");
        facility.setTenDichVu(name);

        double area = Validate.FacilityValidate.validateArea("Enter usable area");
        facility.setDienTichSuDung(area);

        double cost = Validate.FacilityValidate.validateNumber("Enter rental cost ($)", 2);
        facility.setChiPhiThue(cost);

        int num = Validate.FacilityValidate.validatePeople("Enter number of people");
        facility.setSoLuongNguoi(num);


        String rentalType = validateRentalType();
        facility.setKieuThue(rentalType);
        return facility;
    }
    public static String validateRentalType() {
        while (true) {
            try {
                System.out.println("choose rental type\n"
                        + "1. By year\n"
                        + "2. By month\n"
                        + "3. By day\n"
                        + "4. By hour\n"
                );
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        return "By Year";
                    case 2:
                        return "By Month";
                    case 3:
                        return "By Day";
                    case 4:
                        return "By Hour";
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            } catch (IllegalArgumentException e) {
                System.err.println("Wrong number!");
            } catch (Exception e) {
                System.err.println("Please try again!");
            }
        }
    }
}
