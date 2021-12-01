package case_study.Services.facility;

import case_study.models.co_so_vat_chat.Facility;

import java.util.Scanner;

public class GeneralMethodFacility {
    static Scanner scanner = new Scanner(System.in);

    public static Facility getFacility(Facility facility) {

        String name = FacilityValidate.validateInput("Enter services name", "name");
        facility.setTenDichVu(name);

        double area = FacilityValidate.validateArea("Enter usable area");
        facility.setDienTichSuDung(area);

        double cost = FacilityValidate.validateNumber("Enter rental cost ($)", 2);
        facility.setChiPhiThue(cost);

        int num = FacilityValidate.validatePeople("Enter number of people");
        facility.setSoLuongNguoi(num);


        String rentalType = FacilityValidate.validateRentalType();
        facility.setKieuThue(rentalType);
        return facility;
    }
}
