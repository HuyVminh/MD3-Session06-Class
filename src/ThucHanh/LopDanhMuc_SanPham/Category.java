package ThucHanh.LopDanhMuc_SanPham;

public class Category {
    int categoryId;
    String categoryName;

    public Category(){

    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display(){
        System.out.println("Mã danh mục : " + categoryId);
        System.out.println("Tên danh mục : " + categoryName);
    }
}
