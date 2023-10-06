package BaiTap.PhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a");
        int a = scanner.nextInt();
        System.out.println("Nhập b");
        int b = scanner.nextInt();
        System.out.println("Nhập c");
        int c = scanner.nextInt();
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);

        System.out.println(pt1);
        double delta = pt1.getDiscriminant();
        if (delta < 0)
            System.out.println("Phương trình vô nghiệm !");
        else if (delta == 0)
            System.out.println("Phương trình có 2 nghiệm bằng nhau : x = " + pt1.getRoot1());
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt :");
            System.out.println("x1 = " + pt1.getRoot1());
            System.out.println("x2 = " + pt1.getRoot2());
        }
    }
}
