package ThucHanh.LopDanhMuc_SanPham;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;

    public Product() {

    }

    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void display() {
        System.out.println("Mã sản phẩm :" + productId);
        System.out.println("Tên sản phẩm :" + productName);
        System.out.println("Giá sản phẩm :" + productPrice);
        System.out.println("Danh mục sản phẩm :" + category.categoryName);
    }
}
