package bai_tap_lam_them.Class;

public class XeOto extends AbstractPhuongTien{
    public int choNgoi;
    public String kieuXe;

    public XeOto() {
    }

    public XeOto(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int choNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }


    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
}
