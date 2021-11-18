package ss12_java_collection.thuc_hanh.comparator_comparable;
import java.util.Comparator;

public class AgeComparator implements Comparator<HocSinh> {
    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if(o1.getTuoi() > o2.getTuoi()){
            return 1;
        }else if(o1.getTuoi().equals(o2.getTuoi())){
            return 0;
        }else{
            return -1;
        }
    }
}