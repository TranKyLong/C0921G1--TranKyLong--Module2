package ss7_abstract_class_interface.thuc_hanh.b2;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;

    }

    @Override
    public int compareTo(String paramenter) {
        return 0;
    }


//    public int compareTo(ComparableCircle o) {
//        if (getRadius() > o.getRadius()) return 1;
//        else if (getRadius() < o.getRadius()) return -1;
//        else return 1;
//    }


}
