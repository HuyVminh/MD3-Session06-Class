package ThucHanh.LopCaculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caculator caculator = new Caculator();
        System.out.println("Nhập a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập b :");
        double b = scanner.nextDouble();
        caculator.setA(a);
        caculator.setB(b);
        System.out.println("Tổng 2 số là :" + caculator.add());
        System.out.println("Hiệu 2 số là :" + caculator.sub());
        System.out.println("Tích 2 số là :" + caculator.multi());
        System.out.println("Thương 2 số là :" + caculator.div());
    }
}
