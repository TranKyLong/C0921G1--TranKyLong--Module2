package case_study.Services;

import case_study.models.khach_hang_va_nhan_vien.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeServiceImpl {

    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee(100, "Unamed1", "15/5/1990", "Nam", "1234567899", "123456789", "email@gmail.com", "Trung cấp", "Nhân Viên", 150.5));
        employeeList.add(new Employee(101, "Unamed2", "15/5/1992", "Nam", "1234567892", "123456782", "email@gmail2.com", "Cao đẳng", "Nhân Viên", 150.2));
        employeeList.add(new Employee(102, "Phan Tấn Trung", "01/1/1975", "Nam", "1234567893", "123456783", "email@gmail.co3", "sau đại học", "Nhân Viên", 250.0));
    }

    @Override
    public void displayListEmployees() {
        for (Employee i : employeeList) {
            System.out.println(i.toString());
        }

    }

    @Override
    public void addEmloyees() {

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter birthday");
        String birthDay = scanner.nextLine();

        System.out.println("Enter gender");
        String gender = scanner.nextLine();

        System.out.println("Enter the citizen identification number");
        String cmnd = scanner.nextLine();

        System.out.println("Enter phone");
        String phone = scanner.nextLine();

        System.out.println("Enter mail");
        String mail = scanner.nextLine();

        int codeEmployee = 0;
        while (true) {
            try {
                codeEmployee = EmployeeValidate.inputEmployeeCode();
                break;
            } catch (IdExistException e) {
                System.err.println("This Employee code already exist");

            }
        }

        System.out.println("Enter level");
        String level = scanner.nextLine();

        System.out.println("Enter position");
        String position = scanner.nextLine();

        System.out.println("Enter salary");
        int salary = Integer.parseInt(scanner.nextLine());

        employeeList.add(new Employee(codeEmployee, name, birthDay, gender, cmnd, phone, mail, level, position, salary));
    }

    @Override
    public void editEmployee() {
        System.out.println("Enter the code of Employee you want edit");
        int editCode = Integer.parseInt(scanner.nextLine());

        for (Employee i : employeeList) {
            if (i.getEmployeeCode() == editCode) {

                System.out.println("Enter new code");
                i.setEmployeeCode(Integer.parseInt(scanner.nextLine()));

                System.out.println("Enter new name");
              i.setName(scanner.nextLine());

                System.out.println("Enter new birthday");
                i.setBirthDay(scanner.nextLine());

                System.out.println("Enter new gender");
                i.setGender(scanner.nextLine());

                System.out.println("Enter the new citizen identification number");
                i.setCmnd(scanner.nextLine());

                System.out.println("Enter phone");
                i.setPhone(scanner.nextLine());

                System.out.println("Enter  new mail");
                i.setEmail(scanner.nextLine());

                System.out.println("Enter level");
                String level = scanner.nextLine();

                System.out.println("Enter position");
                String position = scanner.nextLine();

                System.out.println("Enter salary");
                int salary = Integer.parseInt(scanner.nextLine());
            }
        }

    }

    public static void main(String[] args) {
        IEmployeeServiceImpl i = new EmployeeServiceImpl();
        i.displayListEmployees();
    }
}
