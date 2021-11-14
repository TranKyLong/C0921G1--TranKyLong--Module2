package case_study.models;

public class Customer extends Person {
    boolean isVip;
    static int zo = 10;
    public Customer(String fullName, int age, String gender, String phone, boolean isVip) {
        super(fullName, age, gender, phone);
        this.isVip = isVip;
    }

    public Customer() {
        super();

    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "khách Vip = " + isVip +
                ", Tên = " + fullName + '\'' +
                ", Tuổi = " + age +
                ", Giới tính = " + gender + '\'' +
                ", Số điện thoại =" + phone + '\'' +
                '}';
    }
}
