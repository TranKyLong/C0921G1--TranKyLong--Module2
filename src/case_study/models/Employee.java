package case_study.models;

public class Employee extends Person {
    double salary;

    public Employee(String fullName, int age, String gender, String phone, double salary) {
        super(fullName, age, gender, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lương =" + salary +
                ", Tên ='" + fullName + '\'' +
                ", Tuổi =" + age +
                ", Giới tính ='" + gender + '\'' +
                ", Số điện thoại ='" + phone + '\'' +
                '}';
    }
}
