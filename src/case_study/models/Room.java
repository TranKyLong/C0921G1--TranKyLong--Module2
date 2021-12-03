package case_study.models;

public class Room extends Facility {
    String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String dichVuMienPhiDiKem,String servicesCode) {
        super( tenDichVu,  dienTichSuDung,  chiPhiThue,  soLuongNguoi,  kieuThue,servicesCode);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }


    @Override
    public String toString() {
        return "Đi kèm: "+this.dichVuMienPhiDiKem +"," + super.toString();
    }
}
