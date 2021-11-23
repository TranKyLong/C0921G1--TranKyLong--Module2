package ss17_serialization.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    static final long serialVersionUID = 1L;
    private String name;
    private String manufacturer;
    private double price;
    private String note;

    public Product() {
    }

    public Product(String name, String manufacturer, double price, String note) {

        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.note = note;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return
                ", Tên :" + name + ' ' +
                ", Hãng sản xuất : " + manufacturer + ' ' +
                ", Giá :" + price +
                ", Ghi chú :" + note ;
    }
}
