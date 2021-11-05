package ss6_ke_thua.lop_2d_va_3d;

public class Class2D {
    private float x = 0.0f;
    private float y = 0.0f;


    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Class2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[]arr = {x,y};
        return arr;
    }

    public String toString() {
        System.out.println("Chiều dọc X là: " + x);
        System.out.println("Chiều ngang Y là: " + y);
        return null;
    }
}


