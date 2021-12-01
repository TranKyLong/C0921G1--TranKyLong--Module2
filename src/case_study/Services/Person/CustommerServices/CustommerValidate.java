package case_study.Services.Person.CustommerServices;
import case_study.models.khach_hang_va_nhan_vien.Customer;
import java.util.Scanner;

public class CustommerValidate {
    static Scanner scanner = new Scanner(System.in);
    public static String pickCustommerType() {
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
    public static Customer isCustommerExist(String code) {
        for (Customer i : CustommerServicesImpl.customerList) {
            if (i.getCustommerCode().equals(code)) {
                return i;
            }
        }
        return null;
    }
}
