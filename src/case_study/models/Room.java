package case_study.models;

public class Room extends Facility {
    Boolean isWindow;


    Room(boolean isWindow, double dienTich, double giaCa,String id) {
        super(dienTich, giaCa,id);
        this.isWindow = isWindow;
        this.giaCa = 30;
    }

    public Boolean getWindow() {
        return isWindow;
    }

    public void setWindow(Boolean window) {
        isWindow = window;
    }

    @Override
    public String toString() {
        return "Room{" +
                "isWindow=" + isWindow + '\''+
                ", dienTich=" + dienTich + '\''+
                ", giaCa=" + giaCa + '\''+
                '}';
    }
}

