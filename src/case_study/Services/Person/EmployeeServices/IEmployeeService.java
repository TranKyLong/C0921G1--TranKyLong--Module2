package case_study.Services.Person.EmployeeServices;

import case_study.models.khach_hang_va_nhan_vien.Employee;

public interface IEmployeeService {
    void displayListEmployees();

    Employee getNewEmployee();

    void editOrAddNewEmployee(String sign);

}
