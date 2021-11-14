package case_study.models;

public class Villa extends Facility {
    String color;
    boolean isNearSea;

    public Villa(String color, boolean isNearSea, double dienTich, double giaCa, String id) {
        super(dienTich, giaCa, id);
        this.color = color;
        this.isNearSea = isNearSea;
        this.giaCa = 50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNearSea() {
        return isNearSea;
    }

    public void setNearSea(boolean nearSea) {
        isNearSea = nearSea;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "color='" + color + '\'' +
                ", isNearSea=" + isNearSea +
                ", dienTich=" + dienTich +
                ", giaCa=" + giaCa +
                ", id='" + id + '\'' +
                '}';
    }
}
