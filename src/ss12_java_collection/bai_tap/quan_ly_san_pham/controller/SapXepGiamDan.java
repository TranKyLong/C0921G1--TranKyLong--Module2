package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaClass;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;

import java.util.Comparator;

import static ss12_java_collection.bai_tap.quan_ly_san_pham.controller.SodaDisplayer.displaySodaList;

public class SapXepGiamDan implements Comparator<SodaClass> {
    @Override
    public int compare(SodaClass o1, SodaClass o2) {
        return o2.getPrice() - o1.getPrice();
    }

    public static void sapXepGiam () {
        SodaList.getSodaList().sort(new SapXepGiamDan());
        displaySodaList(SodaList.getSodaList());
    }
}
