package ss12_java_collection.bai_tap.quan_ly_san_pham;

import ss12_java_collection.bai_tap.quan_ly_san_pham.controller.SodaController;
import ss12_java_collection.bai_tap.quan_ly_san_pham.view.SodaView;

public class AppRunner {
    public static void main(String[] args) {
        SodaController.checkMenu(SodaView.getUserOption());
    }
}
