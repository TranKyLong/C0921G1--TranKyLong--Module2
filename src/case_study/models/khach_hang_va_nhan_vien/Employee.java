package case_study.models.khach_hang_va_nhan_vien;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int maNhanVien, String trinhDo, String viTri, double luong) {
        this.employeeCode = maNhanVien;
        this.level = trinhDo;
        this.position = viTri;
        this.salary = luong;
    }

    public Employee(int maNhanVien, String name, String birthDay, String gender, String cmnd,
                    String phone, String email, String trinhDo, String viTri, double luong) {
        super(name, birthDay, gender, cmnd, phone, email);
        this.employeeCode = maNhanVien;
        this.level = trinhDo;
        this.position = viTri;
        this.salary = luong;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()
                + (String.format("%5s %15s %10s %10s", this.employeeCode, this.level, this.position, this.salary));
    }
}
