package ss4_lop_va_doi_tuong.bai_tap.fan;

public class MyFan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private  int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "color";

    public MyFan() {
    }

    public MyFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }



    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "speed" + this.speed + " color " + this.color + " radius " + this.radius + " \n FAN IS ON";
        }
        return " color " + this.color + " radius " + this.radius + " \n FAN IS OFF";

    }
}
