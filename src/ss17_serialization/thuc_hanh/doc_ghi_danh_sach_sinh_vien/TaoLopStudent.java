package ss17_serialization.thuc_hanh.doc_ghi_danh_sach_sinh_vien;

import java.io.Serializable;

public class TaoLopStudent implements Serializable {
    private int id;
    private String name;
    private String address;

    public TaoLopStudent() {
    }

    public TaoLopStudent(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TaoLopStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
