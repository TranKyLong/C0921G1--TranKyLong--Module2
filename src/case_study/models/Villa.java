package case_study.models;

public class Villa extends Facility {
    String tieuChuanVilla;
    double dienTichHoBoi;
    int soTang;
    String villaServicesCode;


    public Villa() {
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi,
                 String kieuThue, String tieuChuanVilla, double dienTichHoBoi, int soTang, String servicesCode) {

        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, servicesCode);
        this.tieuChuanVilla = tieuChuanVilla;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanVilla() {
        return tieuChuanVilla;
    }

    public void setTieuChuanVilla(String tieuChuanVilla) {
        this.tieuChuanVilla = tieuChuanVilla;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }


    @Override
    public String toString() {
        return "Tiêu chuẩn: " + this.tieuChuanVilla + ","+ super.toString() + "," + "Hồ bơi: "+this.dienTichHoBoi+" m2" + "," + "Diện tích: "+this.getDienTichSuDung() ;
    }
}
