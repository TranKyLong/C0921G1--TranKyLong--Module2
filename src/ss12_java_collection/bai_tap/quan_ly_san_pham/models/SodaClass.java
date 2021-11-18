package ss12_java_collection.bai_tap.quan_ly_san_pham.models;

public class SodaClass {
     int id;
     String name;
     int price;
     int hanSuDung; //tính theo ngày

    public SodaClass(int id, String name, int price, int hanSuDung) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hanSuDung = hanSuDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
}
