package case_study.models;

import java.util.Objects;

public abstract class Facility {

    private String tenDichVu;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;
    private String serivesCode;

    public Facility() {
    }

    public Facility(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String serivesCode) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
        this.serivesCode = serivesCode;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getSerivesCode() {
        return serivesCode;
    }

    public void setSerivesCode(String serivesCode) {
        this.serivesCode = serivesCode;
    }

    @Override
    public String toString() {

        return "Mã: "+this.serivesCode + "," + "Tên: "+this.tenDichVu + "," + "Diện tích : "+ this.dienTichSuDung + "," + "Chi phí: "+this.chiPhiThue + "$" + "," + "Số lượng người: "+this.soLuongNguoi + "," + "Kiểu thuê: "+this.kieuThue ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serivesCode.equals(facility.serivesCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serivesCode);
    }
}
