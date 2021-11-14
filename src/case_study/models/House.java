package case_study.models;

public class House extends Facility {
    boolean is2Floor;

    public House(boolean is2Floor, double dienTich, double giaCa, String id) {
        super(dienTich, giaCa, id);
        this.is2Floor = is2Floor;
        this.giaCa = 30;
    }

    public boolean isIs2Floor() {
        return is2Floor;
    }

    public void setIs2Floor(boolean is2Floor) {
        this.is2Floor = is2Floor;
    }

    @Override
    public String toString() {
        return "House{" +
                " 2 tầng =" + is2Floor + '\'' +
                ", Diện tích =" + dienTich + '\'' +
                ", Giá cả = " + giaCa + '\'' +
                '}';
    }
}
