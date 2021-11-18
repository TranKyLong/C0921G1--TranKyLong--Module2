package ss12_java_collection.bai_tap.quan_ly_san_pham.controller;

import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaList;
import ss12_java_collection.bai_tap.quan_ly_san_pham.models.SodaMenu;

public class SodaController {

    public SodaController(){
    }

    public static void checkMenu(SodaMenu user) {
        switch (user.getMenuOption()) {
            case 1:
                SodaAdder.addSoda();
                break;
            case 2:
                SodaEditor.editSoda();
                break;
            case 3:
               SodaDeleter. deleteSoda();
                break;
            case 4: //Hiển thị danh sách sản phẩm
                SodaDisplayer.displaySodaList(SodaList.getSodaList());
                break;
            case 5:
                SodaFinder.findSoda();
                break;
            case 6:
                SapXepTangDan.sapXepTang();
                break;
            case 7:
                SapXepGiamDan.sapXepGiam();
                break;

        }
    }
}
