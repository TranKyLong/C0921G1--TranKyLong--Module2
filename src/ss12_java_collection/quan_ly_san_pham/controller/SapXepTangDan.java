package ss12_java_collection.quan_ly_san_pham.controller;

import ss12_java_collection.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.quan_ly_san_pham.models.SodaList;

import java.util.Comparator;

import static ss12_java_collection.quan_ly_san_pham.controller.SodaDisplayer.displaySodaList;

public class SapXepTangDan implements Comparator<SodaClass> {
    @Override
    public int compare(SodaClass o1, SodaClass o2) {
        return o1.getPrice() - o2.getPrice();
    }

    public static void sapXepTang () {
        SodaList.getSodaList().sort(new SapXepTangDan());
        displaySodaList(SodaList.getSodaList());
    }
}
