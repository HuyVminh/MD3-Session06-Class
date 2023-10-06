package BaiTap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.MAX);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
