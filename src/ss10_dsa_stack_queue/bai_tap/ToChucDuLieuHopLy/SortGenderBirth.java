package ss10_dsa_stack_queue.bai_tap.ToChucDuLieuHopLy;

import java.util.Comparator;

public class SortGenderBirth implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getGender().compareTo(o2.getGender()) == 0) {
            return o1.getBirthday().compareTo(o2.getBirthday());
        }
        return o1.getGender().compareTo(o2.getGender());
    }


}
