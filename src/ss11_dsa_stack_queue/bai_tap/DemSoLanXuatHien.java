package ss11_dsa_stack_queue.bai_tap;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    private static String str;

    public static void main(String[] args) {
        //Creating map of Books
        Map<String, Integer> myMap = new TreeMap<>();


        String myString = "The random sentence generator generated a random sentence about a random sentence";

        count(myString, myMap);
    }

    public static void count(String str, Map<String, Integer> mapping) {

        String character;
        int number = 1;
        int value;
        String newString = str.toUpperCase();
        String[] stringList = newString.split(" ");
        for (String i : stringList
        ) {

            if (mapping.containsKey(i)) {
                value = mapping.get(i);
                mapping.remove(i);
                mapping.put(i, value + 1);
            } else {
                mapping.put(i, number);
            }

        }
        System.out.println(mapping);

    }

}
