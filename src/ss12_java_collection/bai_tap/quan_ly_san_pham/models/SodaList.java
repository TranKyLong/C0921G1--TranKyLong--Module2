package ss12_java_collection.bai_tap.quan_ly_san_pham.models;

import java.util.LinkedList;

public class SodaList {

    public static LinkedList<SodaClass> sodaList = new LinkedList<SodaClass>();

    public static LinkedList<SodaClass> getSodaList() {
        sodaList.add(new SodaClass(100, "Red Sting", 7000, 175));
        sodaList.add(new SodaClass(120, "Yellow Sting", 8000, 175));
        sodaList.add(new SodaClass(130, "Black Sting", 9000, 175));
        sodaList.add(new SodaClass(125, "Sad Sting", 1000, 1755));
        sodaList.add(new SodaClass(125, "Golden Sting", 80000, 175));
        return sodaList;
    }
}
