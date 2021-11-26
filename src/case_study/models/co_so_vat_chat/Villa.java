package case_study.models.co_so_vat_chat;

public class Villa extends Facility {
    String tieuChuanVilla;
    double dienTichHoBoi;
    int soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        this.tieuChuanVilla = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanVilla = tieuChuanPhong;
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
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanVilla + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                super.toString();
    }
}
