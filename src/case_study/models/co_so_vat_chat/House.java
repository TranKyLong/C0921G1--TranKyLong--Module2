package case_study.models.co_so_vat_chat;

public class House extends Facility {
    String tieuChuanHouse;
    int soTangHouse;

    public House() {
    }

    public House(String tieuChuanHouse, int soTangHouse) {
        this.tieuChuanHouse = tieuChuanHouse;
        this.soTangHouse = soTangHouse;
    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanHouse, int soTangHouse) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanHouse = tieuChuanHouse;
        this.soTangHouse = soTangHouse;
    }

    public String getTieuChuanHouse() {
        return tieuChuanHouse;
    }

    public void setTieuChuanHouse(String tieuChuanHouse) {
        this.tieuChuanHouse = tieuChuanHouse;
    }

    public int getSoTangHouse() {
        return soTangHouse;
    }

    public void setSoTangHouse(int soTangHouse) {
        this.soTangHouse = soTangHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanHouse='" + tieuChuanHouse + '\'' +
                ", soTangHouse=" + soTangHouse + super.toString();
    }
}
