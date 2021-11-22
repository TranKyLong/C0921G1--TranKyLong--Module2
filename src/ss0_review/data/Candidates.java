package ss0_review.data;

import java.time.LocalDate;

public abstract class Candidates implements Comparable<Candidates>{
    private String id;
    private String firstName;
    private String lastName;
    private Integer birth;
    private String address;
    private String phone;
    private String email;
    private Integer type;

//-	0: cho Experience
//-	1: cho Fresher - moi ra duong`
//-	2: cho Intern - thuc tap sinh


    public Candidates() {
    }

    public Candidates(String id, String firstName, String lastName, Integer birth, String address, String phone, String email, Integer type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth=" + birth +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Candidates candidates) {
        return this.getId().compareTo(candidates.getId());
    }
}
