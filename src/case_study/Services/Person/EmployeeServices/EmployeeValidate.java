package case_study.Services.Person.EmployeeServices;
import case_study.models.khach_hang_va_nhan_vien.Employee;
import java.util.Scanner;
public class EmployeeValidate {
    static Scanner scanner = new Scanner(System.in);

    public static Employee isEmployeeExist(String code) {
        for (Employee i : EmployeeService.employeeList) {
            if (i.getEmployeeCode().equals(code)) {
                return i;
            }
        }
        return null;
    }

    public static String pickLevel() {
        while (true) {
            try {
                System.out.println("Enter one position for Employee\n"
                        + "1. Trung cấp"
                        + "2. Cao đẳng"
                        + "3. Đại học "
                        + "4. sau đại học");
                int enterLevel = Integer.parseInt(scanner.nextLine());
                switch (enterLevel) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "sau đại học";
                    default:
                        System.err.println("OutofChoiceAvailable");
                        pickLevel();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            }
        }
        return null;
    }

    public static String pickPositition() {
        while (true) {
            try {
                System.out.println("Enter one position for Employee\n"
                        + "1. Lễ tân\n"
                        + "2. Phục vụ\n"
                        + "3. Chuyên viên\n"
                        + "4. Giám sát\n"
                        + "5. Quản lý\n"
                        + "6. Giám đốc\n");
                int enterPositision = Integer.parseInt(scanner.nextLine());
                switch (enterPositision) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                    default:
                        System.err.println("Out of choice avaiable");
                        pickPositition();
                        break;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            }
        }
        return null;
    }
}
