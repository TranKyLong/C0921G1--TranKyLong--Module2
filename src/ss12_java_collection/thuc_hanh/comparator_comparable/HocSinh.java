package ss12_java_collection.thuc_hanh.comparator_comparable;

public class HocSinh implements Comparable<HocSinh> {

    private String ten;
    private Integer tuoi;
    private String diaChi;

    public HocSinh(String ten, Integer tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }


    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Học sinh: " + getTen() + ", Tuổi: " + getTuoi();
    }

    @Override
    public int compareTo(HocSinh hs) {
        return this.getTen().compareTo(hs.getTen());
    }
}
