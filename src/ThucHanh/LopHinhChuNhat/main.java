package ThucHanh.LopHinhChuNhat;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the Rectangle");
        double height = scanner.nextDouble();
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your Rectangle is:");
        System.out.println(rec.display());
        System.out.println("Perimeter of the Rectangle :");
        System.out.println(rec.getPerimeter());
        System.out.println("Area of the Rectangle :");
        System.out.println(rec.getArea());
    }
}
