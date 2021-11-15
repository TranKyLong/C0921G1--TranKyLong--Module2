package ss10_dsa_stack_queue.bai_tap.ToChucDuLieuHopLy;

import java.time.LocalDate;

public class Person {
    protected String name;
    //protected static LocalDate birthday =  LocalDate.of(2017, 1, 13);
    protected LocalDate birthday;
    protected String gender;

    public Person() {
    }

    public Person(String name, LocalDate birthday, String gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return  birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
