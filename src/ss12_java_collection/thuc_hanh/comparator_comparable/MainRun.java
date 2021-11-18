package ss12_java_collection.thuc_hanh.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRun {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh("Kien", 30, "HT");
        HocSinh hocSinh1 = new HocSinh("Nam", 26, "HN");
        HocSinh hocSinh2 = new HocSinh("Anh", 38, "HT" );
        HocSinh hocSinh3 = new HocSinh("Tung", 38, "HT" );

        List<HocSinh> lists = new ArrayList<HocSinh>();
        lists.add(hocSinh);
        lists.add(hocSinh1);
        lists.add(hocSinh2);
        lists.add(hocSinh3);
        Collections.sort(lists);
        for(HocSinh st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        lists.sort(ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(HocSinh st : lists){
            System.out.println(st.toString());
        }
    }
    }

