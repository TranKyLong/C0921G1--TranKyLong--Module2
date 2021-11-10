package ss6_ke_thua.bai_tap.point_moveablepoint;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        this.setX(x);
        this.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
    }

    public float[] getSpeed() {
        float[] array = {xSpeed, ySpeed};
        return array;
    }


    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                +getX() + getY() +
                '}';
    }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setX(getY() + ySpeed);
        return this;

    }
}


