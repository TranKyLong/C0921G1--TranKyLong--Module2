package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi;

public class Students {
    String name = "John";
    String classes = "CO2";

    public Students() {
    }

    public String setName(String tenMoi) {
        return name = tenMoi;
    }

    public String setClasses(String lopMoi) {
        return this.classes = lopMoi;
    }
}
