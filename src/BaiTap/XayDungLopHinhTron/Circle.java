package BaiTap.XayDungLopHinhTron;

import java.util.Scanner;

public class Circle {
    // Fields
    private double radius;
    private String color;

    // Constructors
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Methods
    // ======Getter and Setter=======

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

    public double tinhChuVi() {
        return 2 * Math.PI * this.radius;
    }

    public double tinhDienTich() {
        return Math.PI * this.radius * this.radius;
    }

    public void displayData() {
        System.out.println("Hình tròn có các thuộc tính là : Bán kính = " + this.radius + ", màu sắc là : " + this.color);
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính :");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc :");
        this.color = scanner.nextLine();
    }
}
