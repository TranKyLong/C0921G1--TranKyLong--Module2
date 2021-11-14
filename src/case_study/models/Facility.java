package case_study.models;

public abstract class Facility {
    protected double dienTich;
    protected double giaCa;
    protected String id;

    public Facility() {
    }

    public Facility(double dienTich, double giaCa,String id ) {
        this.dienTich = dienTich;
        this.giaCa = giaCa;
    }

    public double getDienTich(double v) {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaCa(int i) {
        return giaCa;
    }

    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Facility{" +
                "diện tích = " + dienTich + '\''+
                ", giá cả = " + giaCa + '\'' +
                ", id = " + id + '\'' +

                '}';
    }
}
