package QuanLyThuVien;

import java.util.Scanner;

public class Book {
    int bookId;
    String bookName;
    String author;
    String description;
    double importPrice;
    double exportPrice;
    float interest;
    int quantity;
    boolean bookStatus;

    static int count = 1;

    //Constructor

    public Book() {
        this.bookStatus = true;
        this.bookId = count++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }


    public String getDescriptions() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", quantity=" + quantity +
                '}';
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getInterest() {
        return interest;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã sách :" + bookId);
        System.out.print("Nhập tên sách: ");
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Tên sách không được để trống, hãy nhập lại : ");
            name = scanner.nextLine().trim();
        }
        this.bookName = name;

        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine().trim();
        while (author.isEmpty()) {
            System.out.print("Tên tác giả không được để trống, hãy nhập lại: ");
            author = scanner.nextLine().trim();
        }
        this.author = author;

        System.out.print("Nhập mô tả (tối thiểu 10 ký tự): ");
        String description = scanner.nextLine().trim();
        while (description.length() < 10) {
            System.out.print("Mô tả quá ngắn, hãy nhập lại: ");
            description = scanner.nextLine().trim();
        }
        this.description = description;

        System.out.print("Nhập giá mua vào: ");
        double importPrice = scanner.nextDouble();
        while (importPrice <= 0) {
            System.out.print("Giá mua vào không thể nhỏ hơn 1, hãy nhập lại: ");
            importPrice = scanner.nextDouble();
        }
        this.importPrice = importPrice;

        System.out.print("Nhập giá bán ra (phải lớn hơn 1.2 lần giá nhập): ");
        double exportPrice = scanner.nextDouble();
        while (exportPrice < 1.2 * importPrice) {
            System.out.print("Giá bán ra không lớn hơn 1.2 lần giá nhập, hãy nhập lại: ");
            exportPrice = scanner.nextDouble();
        }
        this.exportPrice = exportPrice;

        this.interest = (float) (exportPrice - importPrice);

        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.print("Số lượng phải lớn hơn 0, hãy nhập lại: ");
            quantity = scanner.nextInt();
        }
        this.quantity = quantity;

        this.bookStatus = true;
    }

    public void displayData() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Descriptions: " + description);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Interest: " + interest);
        System.out.println("Quantity: " + quantity);
        System.out.println("Book Status: " + bookStatus);
    }
}
