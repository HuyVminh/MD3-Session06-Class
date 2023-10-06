package BaiTap.XayDungLopHinhTron;

public class XayDungLopHinhTron {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Chu vi của hình tròn là : " + circle.tinhChuVi());
        System.out.println("Diện thích của hình tròn là : " + circle.tinhDienTich());
        ;
    }
}
