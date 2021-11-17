package ss11_dsa_stack_queue.bai_tap.ToChucDuLieuHopLy;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        ArrayList<Person> studentList = new ArrayList<>();

        studentList.add(new Person("Hung", LocalDate.of(2010, 9, 16), "Nam"));
        studentList.add(new Person("Van", LocalDate.of(2002, 7, 11), "Nu"));
        studentList.add(new Person("Hung", LocalDate.of(2015, 1, 12), "Nam"));
        studentList.add(new Person("Hung", LocalDate.of(2010, 12, 10), "Nam"));
        studentList.add(new Person("Van", LocalDate.of(2002, 7, 11), "Nu"));
        studentList.add(new Person("Van", LocalDate.of(2001, 1, 30), "Nu"));
        studentList.add(new Person("Tim", LocalDate.of(1991, 9, 9), "Nam"));
        studentList.add(new Person("Van", LocalDate.of(2002, 12, 29), "Nu"));
        studentList.add(new Person("Yen", LocalDate.of(1997, 10, 8), "Nu"));
        studentList.add(new Person("Hung", LocalDate.of(2010, 10, 10), "Nam"));
        studentList.add(new Person("Nhi", LocalDate.of(1998, 12, 5), "Nu"));

        System.out.println("trước khi sắp xếp");
        for (Person i : studentList) {
            System.out.println(i.name + ", " + i.birthday + ", " + i.gender);
        }
        studentList.sort(new SortGenderBirth());

        System.out.println("\nsau khi sắp xếp");
        for (Person i : studentList) {
            System.out.println(i.name + ", " + i.birthday + ", " + i.gender);
        }
    }
}
