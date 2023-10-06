package BaiTap.Fan;

public class Fan {
    public static final int MIN = 1, MEDIUM = 2, MAX = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = MIN;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
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
        if (on) {
            return "speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is on";
        } else {
            return "color: " + color + ", radius: " + radius + ", fan is off";
        }
    }
}
