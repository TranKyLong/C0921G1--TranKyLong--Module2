package case_study.models;

public abstract class Person {
    String fullName;
    int age;
    String gender;
    String phone;



    public Person(String fullName, int age, String gender, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;

    }

    public Person() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }



}
