package case_study.Services.Person.EmployeeServices;

import case_study.Services.GeneralMethod;
import case_study.Services.Person.GerenalMethodPerson;
import case_study.controller.FuramaController;
import case_study.models.khach_hang_va_nhan_vien.Employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String EMPLOYEE = "D:\\CodeGym\\1_main_excercise\\module_2\\src\\case_study\\data\\employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee("100", "Unamed1", "15/5/1990", "Nam", "1234567899", "123456789", "email@gmail.com", "Trung cấp", "Nhân Viên", 150.5));
        employeeList.add(new Employee("101", "Unamed2", "15/5/1992", "Nam", "1234567892", "123456782", "email@gmail2.com", "Cao đẳng", "Nhân Viên", 150.2));
        employeeList.add(new Employee("102", "Phan Tấn Trung", "01/1/1975", "Nam", "1234567893", "123456783", "email@gmail.co3", "sau đại học", "Nhân Viên", 250.0));
    }

    public static void writeToCsv() {
        try {
            new FileWriter(EMPLOYEE, false).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Employee i : employeeList) {
            GeneralMethod.writFile(i, EMPLOYEE);
        }
    }

    @Override
    public void displayListEmployees() {
        for (Employee i : employeeList) {
            System.out.println(i.toString());
        }
        GeneralMethod.readFileCsv(EMPLOYEE);
    }

    @Override
    public Employee getNewEmployee() {
        Employee myEmployee = null;
        GerenalMethodPerson.getPerson(myEmployee);

        System.out.println("Enter Employee code");
        String code = null;
        do {
            code = scanner.nextLine();
        } while (EmployeeValidate.isEmployeeExist(code) != null || code == null);
        myEmployee.setEmployeeCode(code);

        System.out.println("Enter position");
        myEmployee.setLevel(scanner.nextLine());

        myEmployee.setPosition(EmployeeValidate.pickPositition());
        myEmployee.setLevel(EmployeeValidate.pickLevel());
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
    public void editOrAddNewEmployee(String sign) {
        displayListEmployees();
        System.out.println(sign);
        Employee theEmployee = EmployeeValidate.isEmployeeExist(scanner.nextLine());
        if (theEmployee != null) {
            System.out.println("This code already exist, do you want edit this Employee\n" +
                    "               [ 1. YES / 2.NO ] ?");
            while (true) {
                try {
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            getNewEmployee();
                            employeeList.set(employeeList.indexOf(theEmployee), getNewEmployee());
                            break;
                        case 2:
                            FuramaController.displayMenu();
                        default:
                            System.err.println("Please enter available number");
                            editOrAddNewEmployee(sign);
                            break;
                    }
                    break;
                } catch (Exception e) {
                    System.err.println("Please enter a number");
                }
            }

        } else {
            employeeList.add(getNewEmployee());
            System.out.println("Sucess");
        }
    }


}
