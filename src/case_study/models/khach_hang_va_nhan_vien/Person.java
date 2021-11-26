package case_study.models.khach_hang_va_nhan_vien;

public abstract class Person {
    private String name;
    private String birthDay;
    private String gender;
    private String cmnd;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(String name, String birthDay, String gender, String cmnd, String phone, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return (String.format("%14s %14s %5s %12s %12s %14s ", this.name, this.birthDay, this.gender, this.cmnd, this.phone, this.email + "\t"));

    }
}

