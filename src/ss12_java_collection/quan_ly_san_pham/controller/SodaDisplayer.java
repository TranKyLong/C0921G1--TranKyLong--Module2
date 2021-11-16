package ss12_java_collection.quan_ly_san_pham.controller;
import ss12_java_collection.quan_ly_san_pham.models.SodaClass;
import java.util.LinkedList;
public class SodaDisplayer {
    public static void displaySodaList(LinkedList<SodaClass> array) {
        System.out.format("%-10s %-15s %-10s %-10s\n",
                "ID ",
                "TÊN SẢN PHẨM ",
                "GIÁ ",
                "HẠN SỬ DỤNG ");
        for (SodaClass i : array
        ) {
            System.out.format("%-10s %-15s %-10s %-10s\n",
                    i.getId(),
                    i.getName(),
                    i.getPrice(),
                    i.getHanSuDung());
        }
    }
}
