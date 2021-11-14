package bai_tap_lam_them.Class;

public class XeTai extends AbstractPhuongTien{
    public int taiTrong;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }
}
