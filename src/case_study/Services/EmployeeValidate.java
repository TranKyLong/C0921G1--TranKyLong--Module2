package case_study.Services;

import case_study.models.khach_hang_va_nhan_vien.Employee;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeValidate {
    static Scanner scanner = new Scanner(System.in);

    public static int inputEmployeeCode() throws IdExistException {
        System.out.println("Enter employee code");
        int codeEmployee = Integer.parseInt(scanner.nextLine());
        if (isEmployeeCodeExist(codeEmployee)) {
            throw new IdExistException();
        }
        return codeEmployee;
    }

    public static boolean isEmployeeCodeExist(int code) {
        boolean isExist = false;
        for (Employee i : EmployeeServiceImpl.employeeList) {
            if (i.getEmployeeCode() == code) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public static boolean validateLevel(){
        System.out.println("Pick one level for Employee\n"
                + "1. Lễ tân\n "
        + "");
    }

    public static void main(String[] args) {

    }
}
