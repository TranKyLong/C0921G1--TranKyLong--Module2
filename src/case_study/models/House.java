package case_study.models;

public class House extends Facility {
    String tieuChuanHouse;
    int soTangHouse;
    String houseServicesCode;

    public House() {
    }

    public House(String tieuChuanHouse, int soTangHouse) {
        this.tieuChuanHouse = tieuChuanHouse;
        this.soTangHouse = soTangHouse;
    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanHouse, int soTangHouse, String servicesCode) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, servicesCode);
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
        return "Tiêu chuẩn: "+this.tieuChuanHouse + "," + "Số tầng: "+this.soTangHouse + "," + super.toString();
    }


}
