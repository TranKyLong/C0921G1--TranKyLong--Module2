package case_study.Services.impl;

import case_study.Services.IPersonServices;
import case_study.utils.ReadWrite;
import case_study.controller.FuramaController;
import case_study.models.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IPersonServices {
    public static final String EMPLOYEE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\employee.csv";
    public static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static FuramaController controller = new FuramaController();

    static {
        employeeList.add(new Employee("100", "Unamed1", "15/5/1990", "Nam", "1234567899", "123456789", "email@gmail.com", "Trung cấp", "Nhân Viên", 150.5));
        employeeList.add(new Employee("101", "Unamed2", "15/5/1992", "Nam", "1234567892", "123456782", "email@gmail2.com", "Cao đẳng", "Nhân Viên", 150.2));
        employeeList.add(new Employee("102", "Phan Tấn Trung", "01/1/1975", "Nam", "1234567893", "123456783", "email@gmail.co3", "sau đại học", "Nhân Viên", 250.0));
    }

    private static void writeToCsv() {
        try {
            new FileWriter(EMPLOYEE, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee i : employeeList) {
            ReadWrite.writFile(i, EMPLOYEE);
        }
    }

    @Override
    public void display() {
        for (String i : ReadWrite.readFileCsv(EMPLOYEE)) {
            System.out.println(i);
        }
    }

    private static Employee getNewEmployee(boolean addNew) {
        Employee myEmployee = new Employee();
        GerenalMethodPerson.getPerson(myEmployee);

        if (!addNew) { //nếu tạo mới thì không cần gọi ra
            System.out.println("Enter Employee code");

            String code = null;
            do {
                code = scanner.nextLine();
            } while (Validate.EmployeeValidate.isEmployeeExist(code) != null || code == null);
            myEmployee.setEmployeeCode(code);
        }

        System.out.println("Enter position");
        myEmployee.setPosition(pickPositition());
        myEmployee.setLevel(pickLevel());
        while (true) {
            try {
                System.out.println("Enter salary");
                myEmployee.setSalary(Double.parseDouble(scanner.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number");
            }
        }
        return myEmployee;
    }

    @Override
    public void editOrAddNew(String sign, boolean addNew) {
        display();
        System.out.println(sign);
        String idCode = scanner.nextLine();
        Employee theEmployee = Validate.EmployeeValidate.isEmployeeExist(idCode);
        if (theEmployee != null && addNew) {
            System.out.println("This code already exist, do you want edit this Employee\n" +
                    "                          [ 1. YES / 2.NO ] ?");

            while (true) {
                try {
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        employeeList.set(employeeList.indexOf(theEmployee), getNewEmployee(false));
                        writeToCsv();
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Please enter a number");
                }
            }

        } else {
            if (!addNew) { //nếu employee code ko có sẵn thì tạo thêm rồi set lại employee code
                System.out.println("This code not already exist, switch to adding mode");
            }
            Employee addNewEmployee =getNewEmployee(true);
            addNewEmployee.setEmployeeCode(idCode);
            employeeList.add(addNewEmployee);
            writeToCsv();
            System.out.println("Sucess");
        }
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
                        return "Trung cấp\n";
                    case 2:
                        return "Cao đẳng\n";
                    case 3:
                        return "Đại học\n";
                    case 4:
                        return "sau đại học";
                    default:
                        System.err.println("Out of Choice Available");
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
