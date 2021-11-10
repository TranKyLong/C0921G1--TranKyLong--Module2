package ss6_ke_thua.bai_tap.lop_2d_va_3d;

public class ClassCon3D extends Class2D {
    float z = 10.5f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public ClassCon3D(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        System.out.println("Chiều dọc X là: " + this.getX());
        System.out.println("Chiều ngang Y là: " + this.getY());
        System.out.println("Chiều sâu Z là: " + z);
        return null;
    }
}
