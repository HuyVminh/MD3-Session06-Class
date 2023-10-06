package ThucHanh.LopDanhMuc_SanPham;

public class main {
    public static void main(String[] args) {
        Category dm1=new Category(1,"Quần");
        Category dm2=new Category(2,"Áo");

        Product p1=new Product(1,"Quần âu",150000,dm1);
        Product p2=new Product(2,"Quần jean",350000,dm1);

        Product p3=new Product(3,"Áo thun",350000,dm2);
        Product p4=new Product(4,"Áo ba lỗ",50000,dm2);

        System.out.println("Tất cả sản phẩm :");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
